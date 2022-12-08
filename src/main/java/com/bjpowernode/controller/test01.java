package com.bjpowernode.controller;

import com.bjpowernode.service.testservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class test01 {

@Autowired
    private testservice testservice01;

    public  void test() {
        testservice01.sout();
    }

}
