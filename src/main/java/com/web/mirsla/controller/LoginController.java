package com.web.mirsla.controller;

import com.web.mirsla.Service.inter.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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

//    @Autowired(name = "login")
    @Autowired
    private LoginService loginService;

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
        System.out.println(email);
        Boolean flag = loginService.checkEmail(email);
        if(flag){
            result.put("flag",flag);
        }else{
            result.put("msg","该邮箱已注册");
        }
        return result;
    }

    /**
     * 检验用户名是否存在
     * @param userName
     * @return
     */
    @RequestMapping(value = "/checkName", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> checkName(String userName){
        Map<String,Object> result = new HashMap<>();

        return result;
    }

    @RequestMapping(value = "/registerMember", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> registerMember(String email, String userName, String password, String verify){
        //判断验证码是否正确


        return null;
    }
}
