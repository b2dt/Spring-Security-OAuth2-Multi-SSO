package brent.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OAuth2MultiSsoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2MultiSsoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OAuth2MultiSsoApplication.class).initializers();
    }
}