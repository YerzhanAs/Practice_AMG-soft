package lesson4.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       FruitBox<Apple> appleBox=new FruitBox<>(new Apple());
       FruitBox<Apple> anotherAppleBox=new FruitBox<>(new Apple());
       FruitBox<Orange> orangeBox=new FruitBox<>(new Orange());
       FruitBox<Fruit> fruitBox=new FruitBox<>();

       System.out.println(appleBox.compare(orangeBox));

       appleBox.transfer(fruitBox);
       appleBox.transfer(anotherAppleBox);
//       appleBox.transfer(orangeBox);
//       fruitBox.transfer(appleBox);

    }

    //Task 1.0
    public static <T> void swap(T[] arr, int n1,int n2){
        T obj=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=obj;
    }

    //Task 1.1
    public static void swap2(Object[] arr, int n1,int n2){
        Object obj=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=obj;
    }

    //Task2
    public static  <T> ArrayList<T> convertToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }


}
