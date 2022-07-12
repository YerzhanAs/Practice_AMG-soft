package lesson4.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBox<T extends Fruit> {
    private ArrayList<T> container;

    public FruitBox() {
        this.container = new ArrayList<T>();
    }

    public FruitBox(T... fruits) {
        this.container = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void add(T fruit){
        this.container.add(fruit);
    }

    public void add(T... fruits){
        this.container.addAll(Arrays.asList(fruits));
    }

    public float getWeight(){
        if(container.size()==0){
            return 0;
        }
        return container.size()*container.get(0).getWeight();
    }

    //First method
//    public boolean compare(FruitBox<?> another){
//        return this.getWeight()==another.getWeight();
//    }

    public boolean compare(FruitBox<?> another){
        return Math.abs(this.getWeight()-another.getWeight())<0.0001;
    }

    public void transfer(FruitBox<? super T> another) {// T не дает вожможность переписать яблоко в апельсин
        if(this==another) {
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }






 }
