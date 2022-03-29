package com.company.AbstractFactory;


import java.util.Scanner;

interface Phone {
    String IPHONE = "IPhone";
    String Samsung = "Samsung";
    String SONY = "Sony";

    void brandName();
}

class Iphone implements Phone {

    @Override
    public void brandName() {
        System.out.println(" A fost creat un telefone Iphone");
    }

}

class Samsung implements Phone {

    @Override
    public void brandName() {
        System.out.println("A fost creat un telefon Samsung");
    }

}

class Sony implements Phone {
    @Override
    public void brandName() {
        System.out.println("A fost creat un telefon Sony");

    }
}

abstract class AbstractFactoryM {
    abstract Phone getPhone(String model);
}

class ApplePhoneFactory extends AbstractFactoryM {
    @Override
    public Phone getPhone(String model) {
        if (model.equalsIgnoreCase("iphone")) {
            return new Iphone();
        }
        return null;
    }
}

class AndroidPhoneFactory extends AbstractFactoryM {
    @Override
    public Phone getPhone(String brand) {
        if (brand.equalsIgnoreCase("Samsung")) {
            return new Samsung();
        } else if (brand.equalsIgnoreCase("Sony")) {
            return new Sony();
        }
        return null;
    }
}

class FactoryProducer {
    public static AbstractFactoryM getFactory(boolean isApple) {
        if (isApple) {
            return new ApplePhoneFactory();
        } else {
            return new AndroidPhoneFactory();
        }
    }
}

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println("Introduceti marca telefonului");
        Scanner scanner = new Scanner(System.in);
        String marca = scanner.nextLine();

        if (marca.equalsIgnoreCase("apple")) {
            AbstractFactoryM phoneFactory2 = FactoryProducer.getFactory(true);
            Phone iphone = phoneFactory2.getPhone("iphone");
            iphone.brandName();

        } else if (marca.equalsIgnoreCase("samsung")) {
            AbstractFactoryM phoneFactory1 = FactoryProducer.getFactory(false);
            Phone samsung = phoneFactory1.getPhone("Samsung");
            samsung.brandName();
        } else if (marca.equalsIgnoreCase("sony")) {
            AbstractFactoryM phoneFactory1 = FactoryProducer.getFactory(false);
            Phone sony = phoneFactory1.getPhone("Sony");
            sony.brandName();
        } else {
            System.out.println("Nu exista asa marca");
            return;
        }

    }
}

