package com.company.builder;

import java.util.Date;


public class Child {

    private final String name;
    private final String lastName;
    private final Date dateOfBirth;
    private final int age;
    private final String colorEyes;
    private final String height;
    private final String placeOfBirth;
    private final boolean vaccinated;
    private final String colorHair;

    private Child(ChildBuilder builder){
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.age = builder.age;
        this.colorEyes = builder.colorEyes;
        this.height = builder.height;
        this.placeOfBirth = builder.placeOfBirth;
        this.vaccinated = builder.vaccinated;
        this.colorHair = builder.colorHair;

    }


    public  static class ChildBuilder{
        private   String name;
        private   String lastName;
        private   Date dateOfBirth;
        private   int age;
        private   String colorEyes;
        private   String height;
        private   String placeOfBirth;
        private   boolean vaccinated;
        private   String colorHair;

        public ChildBuilder withName(String name){
            this.name = name;
            return this;
        }
        public ChildBuilder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public ChildBuilder withDateOfBirth(Date dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public ChildBuilder withAge(int age){
            this.age = age;
            return this;
        }
        public ChildBuilder withColorEyes(String colorEyes){
            this.colorEyes= colorEyes;
            return this;
        }
        public ChildBuilder withHeight(String height){
            this.height= height;
            return this;
        }
        public ChildBuilder withPlaceOfBirth(String placeOfBirth){
            this.placeOfBirth = placeOfBirth;
            return this;
        }
        public ChildBuilder withVaccinated(boolean vaccinated){
            this.vaccinated = vaccinated;
            return this;
        }
        public ChildBuilder withColorHair(String colorHair){
            this.colorHair = colorHair;
            return this;
        }

        public Child build(){
            Child child = new Child(this);
            return child;
        }
 }
    @Override
    public String toString() {
        return "Child {" +
                "name='" + name + "\n" +
                "lastName='" + lastName + "\n" +
                "dateOfBirth=" + dateOfBirth + "\n" +
                "age=" + age + "\n" +
                "colorEyes='" + colorEyes + "\n" +
                "height='" + height + "\n" +
                "placeOfBirth='" + placeOfBirth + "\n" +
                "vaccinated=" + vaccinated + "\n" +
                "colorHair='" + colorHair + "\n" +
                '}';
    }
}
