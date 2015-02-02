package com.myreloader.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Justin on 1/29/2015.
 */

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {

    @Value("${my.number}")
    private String randomInteger;

    @RequestMapping
    public String sayHello(){
        return "Hello World";
    }


    @RequestMapping(value = "/applicationpropstest", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testApplicatonPropertiesEntries() {
        return this.randomInteger;
    }
}
