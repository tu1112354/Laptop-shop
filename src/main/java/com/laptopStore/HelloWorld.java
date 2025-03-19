package com.laptopStore;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String index() {
        return "Hello world!";
    }
}
