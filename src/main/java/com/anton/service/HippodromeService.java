package com.anton.service;

import com.anton.model.Jockey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("hippodrome")
public class HippodromeService {
    private final int length = 100;
    private final ArrayList<Jockey> jockeys = new ArrayList<>();

    @Autowired
    public HippodromeService(Jockey jockey1, Jockey jockey2, Jockey jockey3, Jockey jockey4, Jockey jockey5){
        jockeys.add(jockey1);
        jockeys.add(jockey2);
        jockeys.add(jockey3);
        jockeys.add(jockey4);
        jockeys.add(jockey5);
    }

    public void startRaces() throws InterruptedException {
        for (Jockey jockey: jockeys){
            jockey.setLengthToGo(length);
        }
        for(;;) {
            for (Jockey jockey : jockeys) {
                if (jockey.getLengthToGo() <= 0) {
                    showWinners(jockey);
                    return;
                }
                showTRacks(jockey);
            }
            Thread.sleep(500);
            for(int i = 0; i<15; i++){
                System.out.println("");
            }
        }
    }

    private void showTRacks(Jockey jockey){
        StringBuilder lengthGone = new StringBuilder();
        StringBuilder lengthToGo = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < jockey.getLengthGone()) {
                lengthGone.append("_");
                continue;
            }
            lengthToGo.append("_");
        }
        System.out.println(lengthGone + jockey.getName() + lengthToGo + "||Finish");
        jockey.setLengthToGo(jockey.getLengthToGo() - jockey.getSpeed());
        jockey.setLengthGone(length-jockey.getLengthToGo());
    }

    private void showWinners(Jockey jockey){
        ArrayList<Jockey> derbyWinners = new ArrayList<>();
        for (int i = jockeys.indexOf(jockey); i < jockeys.size(); i++){
            if(jockeys.get(i).getLengthToGo()<=0){
                derbyWinners.add(jockeys.get(i));
            }
            showTRacks(jockeys.get(i));
        }
        System.out.println("The Winner/s is/are: ");
        for (Jockey winner:derbyWinners){
            System.out.println(winner.getName());
        }
    }
}
