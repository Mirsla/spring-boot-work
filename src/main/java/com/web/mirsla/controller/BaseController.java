package com.web.mirsla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Mirsla
 * @DescripTion: spirngBoot中的BaseController需要添加Controller注解，不然在使用过程中会有意想不到的问题
 * @Date: Created in  2017.10.11
 * @Modified By:登录相关
 */

@Controller
public class BaseController {

    public String getAuthUrl(){
        return null;
    }

    /**
     * 获取request请求
     * @return
     */
    protected HttpServletRequest getRequest(){
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
