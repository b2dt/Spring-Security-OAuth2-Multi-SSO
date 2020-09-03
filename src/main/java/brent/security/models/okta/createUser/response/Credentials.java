
package brent.security.models.okta.createUser.response;

import java.util.List;

public class Credentials {

    private List<Email> emails = null;
    private Provider provider;

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

}
