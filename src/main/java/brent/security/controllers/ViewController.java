package brent.security.controllers;

import brent.security.models.okta.User;
import brent.security.services.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class ViewController {

    private RegistrationService registrationService;

    public ViewController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public String registrationHomePage(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("passwordPattern", "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\n");
        return "register";
    }

    @PostMapping
    public String registerNewUser(@ModelAttribute User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "error";
        }
        ResponseEntity<HttpStatus> response = registrationService.createOktaUser(user);
        if (response.getStatusCode().is2xxSuccessful())
            return "index";
        else return "register";
    }
}
