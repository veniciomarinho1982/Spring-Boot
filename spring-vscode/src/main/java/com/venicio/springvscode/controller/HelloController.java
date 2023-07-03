package com.venicio.springvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value="/")
    public String getName(){
        return "Olá Mundo VSCODE!";
    }

    
}
