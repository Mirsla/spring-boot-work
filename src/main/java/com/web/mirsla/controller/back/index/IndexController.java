package com.web.mirsla.controller.back.index;

import com.web.mirsla.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mirsla on 2017/11/5.
 */

@Controller
@RequestMapping("admin")
public class IndexController extends BaseController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String toIndex(){
        return "back/index";
    }

    @RequestMapping(value = "test2", method = RequestMethod.GET)
    public String toTest2(){
        return "back/test2";
    }

    @RequestMapping(value = "test3", method = RequestMethod.GET)
    public String toTest3(){
        return "back/test3";
    }
}
