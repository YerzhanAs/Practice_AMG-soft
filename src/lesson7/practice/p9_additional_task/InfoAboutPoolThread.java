package lesson7.practice.p9_additional_task;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class InfoAboutPoolThread  {
    public static void main(String[] args) throws Exception {
        ExecutorService service= Executors.newFixedThreadPool(4, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
              Thread t=new Thread(r);
              t.setPriority(10);
              t.setName("ABC");
              System.out.println("created");
              return t;
            }
        });

        service.execute(() -> { System.out.println(1); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(2); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(3); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(4); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(5); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(6); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(7); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(8); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(9); });
        Thread.sleep(100);
        service.execute(() -> { System.out.println(10); });
        Thread.sleep(100);


        ScheduledExecutorService scheduledExecutorService=Executors.newSingleThreadScheduledExecutor();


    }
}
