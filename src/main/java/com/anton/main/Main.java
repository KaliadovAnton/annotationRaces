package com.anton.main;

import com.anton.SpringConfiguration;
import com.anton.service.HippodromeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        context.getBean("hippodrome", HippodromeService.class).startRaces();
        context.close();
    }
}
