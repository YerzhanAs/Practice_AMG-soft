package lesson2.contestant;

import lesson2.contestant.Contestant;

public class Person implements Contestant {

    private String name;
    protected int MaxRunDistance;
    protected int MaxJumpHeight;

    public Person(){
        MaxRunDistance=150;
        MaxJumpHeight=4;
        name="Person";
    }


    @Override
    public boolean jump(int height) {
        if(height<=MaxJumpHeight){
            System.out.println(name+" "+" успешно справился с прыжком "+height+" m");
            return true;
        }else{
            System.out.println(name+" "+" не смог справиться с прыжком "+height+" m");
            return false;
        }
    }

    @Override
    public boolean run(int distance) {
        if(distance<=MaxRunDistance){
            System.out.println(name+" "+" пробежал дистанцию "+distance+" m");
            return true;
        }else{
            System.out.println(name+" "+" не смог пробежать  дистанцию "+distance+" m");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person";
    }
}
