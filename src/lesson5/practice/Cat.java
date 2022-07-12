package lesson5.practice;

public class Cat implements Comparable{

    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ((Cat)o).age;
    }

    @Override
    public String toString() {
        return "Cat [" + name + "]";
    }

}
