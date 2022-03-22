package com.company.singletonContinents;

public class Asia {

    public static final Asia INSTANCE = new Asia (456,"miliarde ");

    private int population;
    private String unit;

    private Asia(int population, String unit){
        this.population = population;
        this.unit = unit;
    }
    public static Asia getInstance(){
        return INSTANCE;
    }

    public  int  getPopulation(){
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getUnit(){
        return unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
}
