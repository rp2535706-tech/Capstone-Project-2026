package com.ripplemap.ripplemap.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ripplemap.ripplemap.service.HomeService;

@RestController
@RequestMapping("/api")
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public Map<String, String> home() {
        return homeService.getWelcomeMessage();
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "application", "RippleMap",
            "status", "UP"
        );
    }
}
