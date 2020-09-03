package brent.security.controllers;

import brent.security.models.okta.User;
import brent.security.services.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RegistrationController {
    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<HttpStatus> registerNewUser(@ModelAttribute User user) {
        return registrationService.createOktaUser(user);
    }
}
