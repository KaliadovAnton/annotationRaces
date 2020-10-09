package com.anton.utils;

import org.springframework.beans.factory.annotation.Value;
import java.util.ArrayList;


public class PropertyReader {
    @Value("${horse.lowSpeed}")
    private int lowSpeed;
    @Value("${horse.mediumSpeed}")
    private int mediumSpeed;
    @Value("${horse.highSpeed}")
    private int highSpeed;
    @Value("${jockey.name1}")
    private String name1;
    @Value("${jockey.name2}")
    private String name2;
    @Value("${jockey.name3}")
    private String name3;
    @Value("${jockey.name4}")
    private String name4;
    @Value("${jockey.name5}")
    private String name5;
    private static final ArrayList<Integer> horseSpeeds = new ArrayList<>();
    private static final ArrayList<String> jockeyNames = new ArrayList<>();

    public PropertyReader() {
        horseSpeeds.add(lowSpeed);
        horseSpeeds.add(mediumSpeed);
        horseSpeeds.add(highSpeed);
        jockeyNames.add(name1);
        jockeyNames.add(name2);
        jockeyNames.add(name3);
        jockeyNames.add(name4);
        jockeyNames.add(name5);
    }

    public static ArrayList<Integer> getHorseSpeeds() {
        return horseSpeeds;
    }

    public static ArrayList<String> getJockeyNames() {
        return jockeyNames;
    }
}
