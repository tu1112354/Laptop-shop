package com.laptopStore.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String handleHello(){
        return "Hello from Service";
    }
}
