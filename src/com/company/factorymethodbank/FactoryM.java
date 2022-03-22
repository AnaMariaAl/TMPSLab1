package com.company.factorymethodbank;

public class FactoryM {

    public static TypeCard getcard(String type){
        switch(type){
            case "VISAclasic":
                return new VISAclasic();
            case "VISAGold":
                return new VISAGold();
            case "VISAPlatinum":
                return new VISAPlatinum();
            default :
                return null;
        }
    }
}
