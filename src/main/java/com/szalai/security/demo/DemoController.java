package com.szalai.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello from secured endpoint!");
    }
}
