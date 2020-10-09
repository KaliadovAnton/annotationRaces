package com.anton.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("horse")
@Scope("prototype")
public class Horse {
    private final int speed;
    public Horse(@Value("${horse.speeds}") int[] speeds){
        this.speed = speeds[(int) (Math.random()*2)];
    }
    public int getSpeed() {
        return speed;
    }
}
