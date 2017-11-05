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
    public String toOIndex(){
        return "back/index";
    }
}
