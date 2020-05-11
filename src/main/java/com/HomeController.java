package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = {"/","/welcome**"},method = RequestMethod.GET)
    public ModelAndView welcomePage(){
        System.out.println("Wlcome");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("title","Spring Secuirty Hello World");
        modelAndView.addObject("message","This is welcome Page");
        modelAndView.setViewName("hello");
        return modelAndView;

    }

    @RequestMapping(value = {"/admin**"},method = RequestMethod.GET)
    public ModelAndView adminPage(){
        System.out.println("Admin");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("title","Spring Secuirty Hello World");
        modelAndView.addObject("message","This is Protected Page");
        modelAndView.setViewName("admin");
        return modelAndView;

    }

}
