package com.company.factorymethodbank;

public class VISAPlatinum extends TypeCard{
    public VISAPlatinum(){
        setCreditAmount();
    }
    @Override
    public void setCreditAmount() {
        Amount=500000;
    }
}