package com.web.mirsla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mirsla on 2017/8/24.
 */

@RestController
public class HelloWorldController  extends BaseController{

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello World";
    }


}
