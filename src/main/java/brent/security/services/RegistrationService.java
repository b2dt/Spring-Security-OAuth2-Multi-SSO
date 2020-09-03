package brent.security.services;

import brent.security.mappers.OktaRegistrationMapper;
import brent.security.models.okta.createUser.request.OktaRegistrationRequest;
import brent.security.models.okta.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private OktaRestRequestService oktaRestRequestService;

    public RegistrationService(OktaRestRequestService oktaRestRequestService) {
        this.oktaRestRequestService = oktaRestRequestService;
    }

    public ResponseEntity<HttpStatus> createOktaUser(User user) {
        //map user to registrationRequest
        OktaRegistrationRequest request = OktaRegistrationMapper.mapUser(user);

        return ResponseEntity.ok(oktaRestRequestService.createNewUser(request));

    }
}
