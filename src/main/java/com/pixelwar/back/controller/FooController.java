package com.pixelwar.back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @RequestMapping(value =  "/greeting", method = RequestMethod.GET)
    public String welcomePageAuthenticate() {
        return "Welcome Authenticate!";
    }
    @RequestMapping(value =  "/", method = RequestMethod.GET)
    public String welcomePageHome() {
        return "Welcome!";
    }
}
