package com.example.thymeleaf.thymeleaf_wiky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WikiController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/project")
    public String project() {
        return "project";
    }

    @GetMapping("/architecture")
    public String architecture() {
        return "architecture";
    }

    @GetMapping("/deployment")
    public String deployment() {
        return "deployment";
    }

    @GetMapping("/development")
    public String development() {
        return "development";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
