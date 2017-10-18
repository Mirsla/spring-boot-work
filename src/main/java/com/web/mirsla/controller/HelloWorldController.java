package com.web.mirsla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mirsla
 * @DescripTion:
 * @Date: Created in  2017.10.11
 * @Modified By:
 */

@RestController
public class HelloWorldController  extends BaseController{

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello World";
    }


}
