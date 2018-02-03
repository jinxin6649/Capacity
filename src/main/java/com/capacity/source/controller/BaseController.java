package com.capacity.source.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 俗人 on 2018/1/30.
 */
@Controller
public class BaseController {

    @RequestMapping(value="{username}.html")
    public ModelAndView page(@PathVariable String username){
        ModelAndView mav = new ModelAndView("base/"+username);
        return  mav;
    }


}
