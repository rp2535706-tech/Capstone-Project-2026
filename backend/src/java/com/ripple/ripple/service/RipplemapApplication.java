package com.ripplemap.ripplemap.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public Map<String, String> getWelcomeMessage() {
        return Map.of(
            "application", "RippleMap",
            "message", "Welcome to RippleMap Backend!",
            "status", "Running successfully"
        );
    }
}
