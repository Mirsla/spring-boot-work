package com.web.mirsla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Mirsla
 * @DescripTion:
 * @Date: Created in  2017.10.11
 * @Modified By:
 */
@Controller
public class LoginController{


    @GetMapping(value = "/login" )
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request){
        request.setAttribute("name","mirsla");
        return "login";
    }

}
