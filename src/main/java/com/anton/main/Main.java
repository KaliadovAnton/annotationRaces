package com.anton.main;

import com.anton.service.HippodromeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml"
        );
        System.out.println("");
        System.out.println("");
        System.out.println("");
        context.getBean("hippodrome", HippodromeService.class).startRaces();
        context.close();
    }
}
