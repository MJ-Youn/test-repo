package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * (non-javadoc)
 * 
 * @author MJ Youn
 * @since 2024. 08. 20.
 */
@Controller
public class WebPageController {
    
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

}
