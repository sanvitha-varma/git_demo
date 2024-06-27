package com.example.git_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class New
{
    @GetMapping
    public String getEmployee()
    {
        return "This is feature1";
    }

}
