package com.company;

public class U2 extends Rocket{

    U2(){
        cost = 120;
        weight = 18;
        maxWeight = 29;
        chanceExplosion = 0.0;
        chanceCrash = 0.0;
        currentWeight = weight;
    }
    public boolean launch(){
        chanceExplosion = 0.04 * (currentWeight/(maxWeight-weight));
        return chanceExplosion<=(Math.random()*0.1);
    }
    public boolean land(){
        chanceCrash = 0.08 * (currentWeight/(maxWeight-weight));
        return chanceCrash<=(Math.random()*0.1);

    }
}
