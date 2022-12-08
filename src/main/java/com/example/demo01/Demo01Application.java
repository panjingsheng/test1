package com.example.demo01;

import com.bjpowernode.controller.test01;
import com.bjpowernode.service.testservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Demo01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Demo01Application.class, args);
        testservice testservice = (com.bjpowernode.service.testservice) configurableApplicationContext.getBean("testservice");
        testservice.sout();
    }

}
