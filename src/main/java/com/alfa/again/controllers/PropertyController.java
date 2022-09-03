package com.alfa.again.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class PropertyController {
    @GetMapping("/properties")
    public String createProperty() {
        return "Hello" ;
    }
}
