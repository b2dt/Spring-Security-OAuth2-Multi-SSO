package brent.security.builders;

import brent.security.models.okta.createUser.request.Credentials;
import brent.security.models.okta.createUser.request.OktaRegistrationRequest;
import brent.security.models.okta.createUser.request.Profile;

public final class OktaRegistrationRequestBuilder {
    private OktaRegistrationRequest oktaRegistrationRequest;

    private OktaRegistrationRequestBuilder() {
        oktaRegistrationRequest = new OktaRegistrationRequest();
    }

    public static OktaRegistrationRequestBuilder anOktaRegistrationRequest() {
        return new OktaRegistrationRequestBuilder();
    }

    public OktaRegistrationRequestBuilder withProfile(Profile profile) {
        oktaRegistrationRequest.setProfile(profile);
        return this;
    }

    public OktaRegistrationRequestBuilder withCredentials(Credentials credentials) {
        oktaRegistrationRequest.setCredentials(credentials);
        return this;
    }

    public OktaRegistrationRequest build() {
        return oktaRegistrationRequest;
    }
}
