package brent.security.builders;

import brent.security.models.okta.createUser.request.Credentials;
import brent.security.models.okta.createUser.request.Password;

public final class CredentialsBuilder {
    private Credentials credentials;

    private CredentialsBuilder() {
        credentials = new Credentials();
    }

    public static CredentialsBuilder aCredentials() {
        return new CredentialsBuilder();
    }

    public CredentialsBuilder withPassword(Password password) {
        credentials.setPassword(password);
        return this;
    }

    public Credentials build() {
        return credentials;
    }
}
