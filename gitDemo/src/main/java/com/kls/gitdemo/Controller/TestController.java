package com.kls.gitdemo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangqing
 * @since 2023/1/18 20:50
 */
@RestController
public class TestController {

    @Value("${kls.welcome}")
    private String value;

    @GetMapping("/test")
    public String test() {
        System.out.println(value);
        return value;
    }
}
