package com.example.springboot2.controller;

import com.example.springboot2.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // URI  - /hello-world
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world");

    @GetMapping(path="hello-world")
    public String helloworld() {
        return "hello world";
    }

    @GetMapping(path="hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }

    @GetMapping(path="hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello %s", name));
    }



}
