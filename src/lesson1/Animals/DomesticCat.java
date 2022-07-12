package lesson1.Animals;

public class DomesticCat extends Cat{

    public static int count;

    public DomesticCat(String name, int maxRunDistance, int maxSwimDistance) {
        super("Домашний Кот", name, maxRunDistance, 0);
        count++;
    }
}
