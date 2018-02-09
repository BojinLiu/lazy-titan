package com.lazytitan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liubojin on 2018/1/24 19:27
 */
@Controller
@RequestMapping("/")
public class CommonController {

    @RequestMapping(value="/toIndex", method= RequestMethod.GET)
    public String toIndex(Model model) {
        model.addAttribute("name", "LazyTitan");

        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        System.out.println("12312355");
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login() {
        System.out.println("12312355111");
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "common/index";
    }
}
