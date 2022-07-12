package lesson2.contestant;

import lesson2.contestant.Contestant;

public class Cat implements Contestant {

    private String name;
    protected int MaxRunDistance;
    protected int MaxJumpHeight;

    public Cat(){
        MaxRunDistance=100;
        MaxJumpHeight=3;
        name="Cat";
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
        return "Cat";
    }
}
