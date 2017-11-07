package com.coral.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ccc on 2017/11/6.
 */
@RestController
public class AopController {

    @RequestMapping("/aop")
    @ResponseBody
    String aop() {
        System.out.println("rest method content");
        return "Hello AOP";
    }

}
