package lesson2;

import lesson2.contestant.Cat;
import lesson2.contestant.Contestant;
import lesson2.contestant.Person;
import lesson2.contestant.Robot;
import lesson2.obstacle.Obstacle;
import lesson2.obstacle.Treadmill;
import lesson2.obstacle.Wall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Obstacle> obstacles=new ArrayList<>();

        obstacles.add(new Treadmill(50));
        obstacles.add(new Wall(1));
        obstacles.add(new Treadmill(100));

        ArrayList<Contestant> contestants=new ArrayList<>();

        contestants.add(new Person());
        contestants.add(new Robot());
        contestants.add(new Cat());

        for (Contestant contestant : contestants) {
            for (Obstacle obstacle : obstacles) {
                if(!obstacle.contest(contestant)){
                    break;
                }
            }
        }


    }
}
