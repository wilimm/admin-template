package com.example.amisdemo.controller;

import com.example.amisdemo.domain.AmisApiResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class DemoController {

    @GetMapping("/test/success")
    public AmisApiResult success() {
        return AmisApiResult.success("成功的数据");
    }

    @GetMapping("/test/failure")
    public AmisApiResult failure() {
        return AmisApiResult.failure("错误提示");
    }

    @GetMapping("/v1/test/403")
    public AmisApiResult test403(HttpServletResponse response) {
        response.setStatus(403);
        return AmisApiResult.success(null);
    }

    @GetMapping("/v2/test/403")
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public AmisApiResult test403V2() {
        return AmisApiResult.success(null);
    }
}
