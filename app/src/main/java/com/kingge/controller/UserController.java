package com.kingge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public Object getUser(){
        Map<String,String> map  = new HashMap<>();
        map.put("msg","访问成功！！！！！");
        return map;
    }

}
