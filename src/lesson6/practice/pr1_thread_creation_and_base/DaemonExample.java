package lesson6.practice.pr1_thread_creation_and_base;

public class DaemonExample {
    public static void main(String[] args) {

        //остановить не важный поток
        // работает до тех пор пока main не остановить работу
        Thread tTimer =new Thread(()-> {
          int time=0;
          while(true){
              try{
                Thread.sleep(1000);
                time++;
                  System.out.println("time: "+time);
              }catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
        });

        tTimer.setDaemon(true);
        tTimer.start();
        System.out.println("main-> sleep");

        try{
          Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("main-> end");


    }
}
