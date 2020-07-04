package com.sanhang.sanhangserver.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {

    @GetMapping("/test")
    public String test(String name) {
        return "Hi," + name;
    }
}
