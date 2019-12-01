package com.security.hack.securityhack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/welcome")
    public String getWelcomePage() {
        return "welcome";
    }

    @GetMapping("/users")
    public String getAllUsers() {
        return "Am a user";
    }

    @GetMapping("/admins")
    public String getAllAdmins() {
        return "Am admin";
    }
}
