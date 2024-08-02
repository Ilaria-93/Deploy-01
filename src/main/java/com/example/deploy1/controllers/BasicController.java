package com.example.deploy1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private String devName = "Ilaria";

    @GetMapping("/devName")
    public String getDevName() {
        return devName;
    }
}
