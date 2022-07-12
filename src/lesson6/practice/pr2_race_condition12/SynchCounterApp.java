package lesson6.practice.pr2_race_condition12;

public class SynchCounterApp {
    public static void main(String[] args) {
        SynchCounter synchCounter=new SynchCounter();

        Thread incthread=new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchCounter.inc();
                try{
                    Thread.sleep(5);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread decthread=new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchCounter.dec();
                try{
                    Thread.sleep(5);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        try {
            incthread.start();
            decthread.start();
            incthread.join();
            decthread.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("All value: "+synchCounter.value());


    }
}
