package com.company.factorymethodbank;

import java.util.Scanner;

public class Moldindconbank {
    public static void main(String[] args) {
        String cardtype ="";
        Scanner sc=new Scanner(System.in);

        System.out.println("Scrie salariul tau :");

        double salary=sc.nextDouble();
        if(salary<50000){
            cardtype="VISAclasic";
        }else if(salary <200000){
            cardtype="VISAGold";
        }else{
            cardtype="VISAPlatinum";
        }

        TypeCard mycard= FactoryM.getcard(cardtype);
        System.out.println(mycard);
    }
}
