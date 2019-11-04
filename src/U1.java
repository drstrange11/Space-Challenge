package com.company;

public class U1  extends Rocket{

    U1(){
        cost = 100;
        weight = 10;
        maxWeight = 18;
        chanceExplosion = 0.0;
        chanceCrash = 0.0;
        currentWeight = weight;
    }
    public boolean launch(){
        chanceExplosion = 0.05 * (currentWeight/(maxWeight-weight));
        return chanceExplosion<=(Math.random()*0.1);
    }
    public boolean land(){
        chanceCrash = 0.01 * (currentWeight/(maxWeight-weight));
        return chanceCrash<=(Math.random()*0.1);

    }
}
