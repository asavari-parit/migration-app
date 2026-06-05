package com.example.migration_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/employees")
    public String getEmployees() {
        return "DB Connection Test Successful";
    }
}