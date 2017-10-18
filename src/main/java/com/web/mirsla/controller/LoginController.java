package com.web.mirsla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Mirsla
 * @DescripTion:
 * @Date: Created in  2017.10.11
 * @Modified By:登录相关
 */
@Controller
public class LoginController{

    /**
     * 跳转到登陆页面
     * @param request
     * @return
     */
    @GetMapping(value = "/login" )
    public String toLoginPage(HttpServletRequest request){
        request.setAttribute("name","mirsla");
        return "login/login";
    }

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String toRegisterPage(){
        return "login/register";
    }

    /**
     * 校验email邮箱是否注册
     * @param email
     * @return
     */
    @RequestMapping(value = "/cheakEmail", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> checkEmial(String email){
        Map<String,Object> result = new HashMap<String,Object>();

        return result;
    }
}
