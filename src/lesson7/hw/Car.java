package lesson7.hw;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable{

    private static int CARS_COUNT;
    private static AtomicInteger ai;

    static {
        CARS_COUNT = 0;
        ai=new AtomicInteger(0);
    }

    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier cyclicBarrier;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cyclicBarrier) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cyclicBarrier.await();
            cyclicBarrier.await();

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }


//            static Object monitor=...;
//              static boolean haveWinner=false;
//              synchronized (monitor){
//                  if(!haveWinner){
//                      haveWinner=true;
//                      System.out.println(name+" Win ");
//                  }
//              }

            //lock.tryLock()
            //boolean..

            if(ai.incrementAndGet()==1){
                System.out.println(name+" Win");
            }

            cyclicBarrier.await();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
