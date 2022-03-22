package com.company.AbstractFactory;


import java.util.Scanner;

interface Phone
{
    String IPHONE = "IPhone";
    String Nokia = "Nokia";
    String SONY = "Sony";
    void brandName();
}
class Iphone implements Phone
{

    @Override
    public void brandName() {
        System.out.println(" A fost creat un telefone Iphone");
    }

}
class Nokia implements Phone
{

    @Override
    public void brandName() {
        System.out.println("A fost creat un telefon Nokia");
    }

}

class Sony implements Phone
{
    @Override
    public void brandName() {
        System.out.println("A fost creat un telefon Sony");

    }
}
abstract class AbstractFactory
{
    abstract Phone getPhone(String model) ;
}
class ApplePhoneFactory extends AbstractFactory {
    @Override
    public Phone getPhone(String model){
        if(model.equalsIgnoreCase("iphone")){
            return new Iphone();
        }
        return null;
    }
}
class AndroidPhoneFactory extends AbstractFactory {
    @Override
    public Phone getPhone(String brand)
    {
        if(brand.equalsIgnoreCase("Nokia"))
        {
            return new Nokia();
        }
        else if(brand.equalsIgnoreCase("Sony"))
        {
            return new Sony();
        }
        return null;
    }
}
class FactoryProducer
{
    public static AbstractFactory getFactory(boolean isApple)
    {
        if(isApple)
        {
            return new ApplePhoneFactory();
        }
        else
        {
            return new AndroidPhoneFactory();
        }
    }
}

public  class AbstractFactoryPattern
{
    public static void main(String[] args)
    {
        System.out.println("Introduceti marca telefonului");
        Scanner scanner = new Scanner(System.in);
        String marca = scanner.nextLine();

        if (marca.equalsIgnoreCase("apple")){
            AbstractFactory phoneFactory2 = FactoryProducer.getFactory(true);
            Phone iphone = phoneFactory2.getPhone("iphone");
            iphone.brandName();

        } else if (marca.equalsIgnoreCase("nokia")){
            AbstractFactory  phoneFactory1 = FactoryProducer.getFactory(false);
            Phone nokia = phoneFactory1.getPhone("Nokia");
            nokia.brandName();
        } else if (marca.equalsIgnoreCase("sony")){
            AbstractFactory  phoneFactory1 = FactoryProducer.getFactory(false);
            Phone sony =  phoneFactory1.getPhone("Sony");
            sony.brandName();
        } else {
            System.out.println("Nu exista asa marca");
            return;
        }

    }
}

