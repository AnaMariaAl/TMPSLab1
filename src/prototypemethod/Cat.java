package prototypemethod;

public class Cat implements Prototype {

    private String name;
    private String race;
    private int age;

    public Cat() {
        System.out.println(" Cat  description ");
        System.out.println("---------------------------------");
        System.out.println("Name" + "\t" + "Cat race" + "\t" +     "Age");
    }

    public Cat(String name, String race, int age) {
        this();
        this.name = name;
        this.race = race;
        this.age = age;
        showCat();
    }

    private void showCat() {
        System.out.println(name + "\t" + race + "\t\t" + age);
    }

    @Override
    public Prototype getClone() {
        return new Cat(name, race, age);
    }
}