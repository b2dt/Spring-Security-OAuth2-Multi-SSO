
package brent.security.models.okta.createUser.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {

    private Schema schema;
    private Activate activate;
    private Self self;
    @JsonProperty("type")
    private LinkType type;

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Activate getActivate() {
        return activate;
    }

    public void setActivate(Activate activate) {
        this.activate = activate;
    }

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public LinkType getType() {
        return type;
    }

    public void setType(LinkType type) {
        this.type = type;
    }

}
