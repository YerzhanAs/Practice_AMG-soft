package lesson6.practice.pr3_synchronization;

public class SynchMonitorApp {
    private Object monitor=new Object();

    public static void main(String[] args) {
     SynchMonitorApp synchMonitorApp=new SynchMonitorApp();
     new Thread(() ->synchMonitorApp.method()).start();
     new Thread(() ->synchMonitorApp.method()).start();
     new Thread(() ->synchMonitorApp.method()).start();

    }

    public void method() {
        try{
            System.out.println("NonSynch-begin "+Thread.currentThread().getName());
            for (int i = 0; i < 3; i++) {
                System.out.println(".. ");
                Thread.sleep(200);
            }
            System.out.println("NonSynch-end "+Thread.currentThread().getName());

            synchronized (monitor){
                System.out.println("Synch-begin "+Thread.currentThread().getName());
                for (int i = 0; i < 5; i++) {
                    System.out.println(".. ");
                    Thread.sleep(200);
                }
                System.out.println("Synch-end "+Thread.currentThread().getName());
            }

        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }

    }

}



