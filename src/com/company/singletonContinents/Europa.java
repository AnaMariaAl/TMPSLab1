package com.company.singletonContinents;

public class Europa {
    public static final Europa INSTANCE = new Europa(746,"milioane ");

    private int population;
    private String unit;

    private Europa(int population, String unit){
        this.population = population;
        this.unit = unit;
    }
    public  int getPopulation(){
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
