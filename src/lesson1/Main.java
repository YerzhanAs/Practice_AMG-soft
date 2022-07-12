package lesson1;

import lesson1.Animals.*;

public class Main {

    public static void main(String[] args) {

        Animal[] animals={
              new Dog("Barsik",500,10),
              new DomesticCat("Masi",200,0),
              new Tiger("Albert",700,500)
        };

        for (Animal animal : animals) {
            animal.run(200);
            animal.swim(50);
        }

        System.out.println("Animals count:" +Animal.count);
        System.out.println("Dogs count:" +Dog.count);
        System.out.println("Cats count:" + Cat.count);
        System.out.println("Domestic cats count:" +DomesticCat.count);
        System.out.println("Tigers count:" +Tiger.count);

    }
}
