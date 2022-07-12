package lesson2.obstacle;

import lesson2.contestant.Contestant;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if(contestant.jump(height)){
            System.out.println(contestant.toString()+" "+" смог перепрыгнуть ");
            return true;
        }else{
            System.out.println(contestant.toString()+" "+" не смог перепрыгнуть ");
            return false;
        }
    }
}
