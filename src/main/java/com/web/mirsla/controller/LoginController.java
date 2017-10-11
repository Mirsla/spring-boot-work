package com.web.mirsla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Mirsla
 * @DescripTion:
 * @Date: Created in  2017.10.11
 * @Modified By:
 */
@Controller
public class LoginController extends BaseController{


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }


    @RequestMapping
    public String geta(){
        return null;
    }
}
