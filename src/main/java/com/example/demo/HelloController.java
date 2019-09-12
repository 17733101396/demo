package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello Jenkins";
    }
	
	@RequestMapping("/hello2")
    public String sayHello2(){
        return "Hello Github";
    }

}
