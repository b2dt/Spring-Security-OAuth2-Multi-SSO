package brent.security.builders;

import brent.security.models.okta.createUser.request.Password;

public final class PasswordBuilder {
    private Password password;

    private PasswordBuilder() {
        password = new Password();
    }

    public static PasswordBuilder aPassword() {
        return new PasswordBuilder();
    }

    public PasswordBuilder withValue(String value) {
        password.setValue(value);
        return this;
    }

    public Password build() {
        return password;
    }
}
