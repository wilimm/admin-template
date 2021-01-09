package com.example.amisdemo.controller;

import com.example.amisdemo.domain.AmisApiResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectTestController {

    @Data
    @AllArgsConstructor
    public static class Person {
        private String name;
        private int age;
    }

    @GetMapping("/object/test/person")
    public AmisApiResult test() {
        return AmisApiResult.success(new Person("张三", 10));
    }
}
