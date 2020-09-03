package brent.security.services;

import brent.security.models.okta.createUser.request.OktaRegistrationRequest;
import brent.security.models.okta.createUser.response.OktaRegistrationResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

@Service
public class OktaRestRequestService {
    private RestTemplate restTemplate;
    private String oktaBaseUrl;
    private String apiKey;

    public OktaRestRequestService(@Qualifier("restTemplate") RestTemplate restTemplate, @Value("${okta.urls.base-url}") String oktaBaseUrl, @Value("${okta.security.oauth2.apiKey}") String apiKey) {
        this.restTemplate = restTemplate;
        this.oktaBaseUrl = oktaBaseUrl;
        this.apiKey = apiKey;
    }

    public HttpStatus createNewUser(OktaRegistrationRequest request) {
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(oktaBaseUrl)
                    .path("/api/v1/users")
                    .queryParam("activate", false);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            httpHeaders.set(HttpHeaders.AUTHORIZATION, String.format("SSWS %s", apiKey));
            ResponseEntity<OktaRegistrationResponse> response = restTemplate.exchange(builder.toUriString(), HttpMethod.POST, new HttpEntity<>(new ObjectMapper().writeValueAsString(request), httpHeaders), OktaRegistrationResponse.class);
            if (response.getStatusCode().is2xxSuccessful())
                return response.getStatusCode();
            else
                throw new RuntimeException(String.format("Failed to create new user: %s with status code: %s", request.getProfile().getLogin(), response.getStatusCode()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}