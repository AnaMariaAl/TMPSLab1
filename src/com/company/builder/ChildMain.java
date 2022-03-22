package com.company.builder;

public class ChildMain {
    public static void main(String[] args) {

        Child johnny  = new Child.ChildBuilder()
                .withName("Johnny ")
                .withLastName("Cash ")
                .withAge(7)
                .withPlaceOfBirth(" Chisinau ")
                .withVaccinated(true)
                .build();

        System.out.println(johnny.toString());
    }
}