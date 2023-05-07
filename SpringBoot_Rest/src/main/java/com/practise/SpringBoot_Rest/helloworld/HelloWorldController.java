package com.practise.SpringBoot_Rest.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {
    @Autowired    /*Internationaliztion*/
    private MessageSource messageSource;   /*Internationaliztion*/

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello Programmer";
    }

//Return bean
    @GetMapping("/hello-world-bean")
    public HelloworldBean helloWorldBean() {

        return new HelloworldBean("Hello Programmer");
    }

//Path variable -> //name aafai url ma lekhney
    @GetMapping("/hello-world/path-variable/{name}")
    public HelloworldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloworldBean(String.format("Hello World, %s",name));
    }

    /*Internationaliztion*/
    @GetMapping("/hello-world-international")
    public String helloWorldInternationalized(@RequestHeader(name= "Accept-Language", required=false) Locale locale){
        return messageSource.getMessage("good.morning.message",null, locale);
    }
}

