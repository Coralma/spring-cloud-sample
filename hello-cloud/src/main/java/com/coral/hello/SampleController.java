package com.coral.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @Autowired
    ModelProperties modelProperties;

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello World";
    }

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello greetings from Spring Boot! name is " + modelProperties.getName() + " , title is "+modelProperties.getTitle();
    }

}