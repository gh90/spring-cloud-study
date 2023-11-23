package dev.gh90.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${dev.gh90.test}")
    private String test;

    @GetMapping("/v1/properties")
    public ResponseEntity getProperties(){
        return ResponseEntity.ok(test);
    }
}
