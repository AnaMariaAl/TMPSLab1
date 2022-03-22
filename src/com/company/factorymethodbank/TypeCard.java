package com.company.factorymethodbank;

public  abstract class TypeCard {
    protected double Amount;
    public abstract void setCreditAmount();

    @Override
    public String toString(){
        return "Cardul tau e "+this.getClass().getSimpleName()+" & suma ta este "+ Amount;
    }
}
