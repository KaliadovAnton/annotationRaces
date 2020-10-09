package com.anton.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("jockey")
@Scope("prototype")
public class Jockey {

    private static int id;
    private final String name;
    private final Horse horse;
    private int speed;
    private int lengthToGo;
    private int lengthGone;

    @Autowired
    public Jockey (Horse horse, @Value("${jockey.names}") String[] names){
        this.horse = horse;
        speed = horse.getSpeed();
        this.name = names[id];
        id+=1;
    }

    @PostConstruct
    public void init(){
        speed+= Math.random() * 2 - 1;
    }

    public void setLengthGone(int lengthGone) {
        this.lengthGone = lengthGone;
    }

    public int getLengthGone() {
        return lengthGone;
    }

    public String getName() {
        return name;
    }

    public Horse getHorse() {
        return horse;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLengthToGo(int length) {
        this.lengthToGo = length;
    }

    public int getLengthToGo() {
        return lengthToGo;
    }
}
