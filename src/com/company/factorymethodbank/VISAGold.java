package com.company.factorymethodbank;

public class VISAGold extends TypeCard {
    public VISAGold() {
        setCreditAmount();
    }

    @Override
    public void setCreditAmount() {
        Amount = 300000;
    }
}