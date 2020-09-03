package brent.security.mappers;

import brent.security.builders.CredentialsBuilder;
import brent.security.builders.OktaRegistrationRequestBuilder;
import brent.security.builders.PasswordBuilder;
import brent.security.builders.ProfileBuilder;
import brent.security.models.okta.createUser.request.OktaRegistrationRequest;
import brent.security.models.okta.User;

public class OktaRegistrationMapper {
    public static OktaRegistrationRequest mapUser(User user) {
        return OktaRegistrationRequestBuilder.anOktaRegistrationRequest()
                .withCredentials(CredentialsBuilder.aCredentials()
                        .withPassword(PasswordBuilder.aPassword().withValue(user.getPassword()).build())
                        .build())
                .withProfile(ProfileBuilder.aProfile()
                        .withFirstName(user.getFirstName())
                        .withLastName(user.getLastName())
                        .withEmail(user.getEmail())
                        .withLogin(user.getUsername())
                        .build())
                .build();
    }
}
