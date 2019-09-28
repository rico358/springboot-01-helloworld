package com.rico358.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Author:liuxu
 * Description:
 * Date:Create in 8:59 2019/9/27
 * Modified By:
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
