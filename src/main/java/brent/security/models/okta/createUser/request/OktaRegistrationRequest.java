package brent.security.models.okta.createUser.request;

public class OktaRegistrationRequest {

    private Profile profile;
    private Credentials credentials;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

}
