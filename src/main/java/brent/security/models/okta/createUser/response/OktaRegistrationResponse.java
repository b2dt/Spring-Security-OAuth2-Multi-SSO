
package brent.security.models.okta.createUser.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OktaRegistrationResponse {

    private String id;
    private String status;
    private String created;
    private Object activated;
    private Object statusChanged;
    private Object lastLogin;
    private String lastUpdated;
    private Object passwordChanged;
    private Type type;
    private Profile profile;
    private Credentials credentials;
    @JsonProperty("_links")
    private Links links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Object getActivated() {
        return activated;
    }

    public void setActivated(Object activated) {
        this.activated = activated;
    }

    public Object getStatusChanged() {
        return statusChanged;
    }

    public void setStatusChanged(Object statusChanged) {
        this.statusChanged = statusChanged;
    }

    public Object getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Object lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Object getPasswordChanged() {
        return passwordChanged;
    }

    public void setPasswordChanged(Object passwordChanged) {
        this.passwordChanged = passwordChanged;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

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

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
