package com.example.testwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SchoolController {

    @RequestMapping(value = "/school", method = RequestMethod.GET)
    @ResponseBody
    public String school() {
        return "学校001";
    }
}
