package lesson7.practice.p9_additional_task;

public class TheredException {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
              int x=10;
                System.out.println(1);
                x=x/0;
                System.out.println(2);
            }
        });
        t.start();

        t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                e.printStackTrace();
                System.out.println("Catched");
            }
        });
    }
}
