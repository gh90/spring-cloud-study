package dev.gh90.server.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test}")
    private String test;

    @GetMapping("/test")
    public ResponseEntity getTest(){
        return ResponseEntity.ok(test);
    }
}
