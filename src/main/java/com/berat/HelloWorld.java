package com.berat;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorld {

    @GetMapping("")
    public ResponseEntity<?> helloWorld() {
        System.out.println("Hello CICD Worldd");
        return ResponseEntity.ok("Hello CICD Worldd");
    }
}
