package Enum_example;

public class Main {
    public static void main(String[] args) {
        for(Fruit fruit : Fruit.values()) {

            System.out.printf("Средний вес фрукта %s составляет: %d ед.\n",

                    fruit.getRussianTitle(), fruit.getWeight());
        }
    }
}