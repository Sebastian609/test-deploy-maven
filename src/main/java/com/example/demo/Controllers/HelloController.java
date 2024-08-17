package com.example.demo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hola")
public class HelloController {
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello!");
    }
}
