package lesson2.obstacle;

import lesson2.contestant.Contestant;

public class Treadmill implements Obstacle{


    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if(contestant.run(length)){
            System.out.println(contestant.toString()+" смог пробежать");
            return true;
        }else{
            System.out.println(contestant.toString()+"не смог пробежать");
            return false;
        }
    }
}
