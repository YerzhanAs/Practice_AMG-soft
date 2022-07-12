package lesson6.practice.pr3_synchronization;

public class SynchStaticMethodApp {
    public static void main(String[] args) {
      // они работают параллельно
        SynchStaticMethodApp e=new SynchStaticMethodApp();
        new Thread(() ->ClassMethod()).start();
        new Thread(() ->e.ObjectMethod()).start();

    }

    public synchronized static void ClassMethod() {
        System.out.println("Synch Static Method start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Synch Static Method end");
    }

    public synchronized  void ObjectMethod() {
        System.out.println("Synch  Method start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Synch  Method end");
    }
}
