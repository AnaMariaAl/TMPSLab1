package com.company.singletonContinents;

public class  Africa {
    public static final Africa INSTANCE = new Africa (1.216,"miliarde");


    private double population ;
    private String unit ;

    private Africa (double population, String unit) {
        this.population = population;
        this.unit = unit;
    }
    public  double getPopulation(){
        return population;
    }
    public void setPopulation(double population) {
        this.population = population;
    }
    public String getUnit(){
        return unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
}
