package com.alfa.again.controllers;

import com.alfa.again.commons.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alfa.again.dto.valuesDTO;
@CrossOrigin
@RestController
@RequestMapping(URI.uri)
public class CalculatorController {
    // Request Params
    @Autowired
    private valuesDTO valuesDTO;

    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + num2;
    }

    // Path Variable
    @GetMapping("/sub/{num1}/{num2}")
    public Integer subtract(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return num1 - num2;

    }


}