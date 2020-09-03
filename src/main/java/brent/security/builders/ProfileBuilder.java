package brent.security.builders;

import brent.security.models.okta.createUser.request.Profile;

public final class ProfileBuilder {
    private Profile profile;

    private ProfileBuilder() {
        profile = new Profile();
    }

    public static ProfileBuilder aProfile() {
        return new ProfileBuilder();
    }

    public ProfileBuilder withFirstName(String firstName) {
        profile.setFirstName(firstName);
        return this;
    }

    public ProfileBuilder withLastName(String lastName) {
        profile.setLastName(lastName);
        return this;
    }

    public ProfileBuilder withEmail(String email) {
        profile.setEmail(email);
        return this;
    }

    public ProfileBuilder withLogin(String login) {
        profile.setLogin(login);
        return this;
    }

    public Profile build() {
        return profile;
    }
}
