package com.kellogg.aspectdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectController {

    @GetMapping("/get")
    public String get() {
        return "Cool!";
    }
}
