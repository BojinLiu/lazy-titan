package com.lazytitan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liubojin on 2018/1/15 19:04
 */
@Controller
public class HelloController {


    @RequestMapping("/json")
    @ResponseBody
    public Map<String,Object> json() {
        Map<String,Object> map = new HashMap<String,Object>(1);
        map.put("name","LazyTitan");

        return map;

    }
}
