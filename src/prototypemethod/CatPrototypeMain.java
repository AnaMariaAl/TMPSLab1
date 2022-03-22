package prototypemethod;

public class CatPrototypeMain{

    public static void main(String[] args) {
        Cat cat1 = new Cat("Felix", "British", 2);

        Cat  cat2 = (Cat) cat1.getClone();

   //     Cat cat3 = new Cat("Garfield", "Persian", 3);

   //     Cat  cat4 = (Cat) cat3.getClone();
    }
}
