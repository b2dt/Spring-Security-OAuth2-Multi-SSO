package brent.security;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class DevServer extends OAuth2MultiSsoApplication {

    public static void main(String[] args) {
        new DevServer().configure(new SpringApplicationBuilder()).initializers().profiles("local", "devl").run(args);
    }
}