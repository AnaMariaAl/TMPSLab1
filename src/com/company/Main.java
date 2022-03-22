package com.company;

import com.company.singletonContinents.Africa;
import com.company.singletonContinents.Asia;
import com.company.singletonContinents.Europa;

public class Main {

    public static void main(String[] args) {
        Europa europa = Europa.INSTANCE;
        Europa europa1 = Europa.INSTANCE;
        europa.setPopulation(800);
        System.out.println(europa + " Europaare  populatie de : " + europa.getPopulation() + " " + europa.getUnit());
        System.out.println(europa1 + " Europa are populatie de : " + europa1.getPopulation() + " " + europa1.getUnit());


        System.out.println("//---------------------------------------------------//");


        Asia asia = Asia.getInstance();
        Asia asia1 = Asia.getInstance();
        asia.setPopulation(500);
        System.out.println(asia + " Asia are  populatie de : " + asia.getPopulation() + " " + asia.getUnit());
        System.out.println(asia1 + " Asia are  populatie de : " + asia1.getPopulation() + " " + asia1.getUnit());


        System.out.println("//---------------------------------------------------//");


        Africa africa = Africa.INSTANCE;
        Africa africa1 = Africa.INSTANCE;
        africa.setPopulation(2.216);
        System.out.println(africa + " Africa are  populatie de : " + africa.getPopulation() + " " + africa.getUnit());
        System.out.println(africa1 + " Africa are  populatie de : " + africa1.getPopulation() + " " + africa1.getUnit());

    }
}
