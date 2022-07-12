package lesson6.practice.pr4_deadlock;

public class DeadlockApp {
    private static final Object lock1=new Object();
    private static final Object lock2=new Object();
    // система будет работать хорошо если порядок будет работать так
    // lock1, lock2 потом lock1, lock2
    // плохо если так
    // lock1, lock2 потом lock2, lock1

    public static void main(String[] args) {
        DeadThreadOne threadOne=new DeadThreadOne();
        DeadThreadTwo threadTwo=new DeadThreadTwo();

        threadOne.start();
        threadTwo.start();

    }

    private static class DeadThreadOne extends Thread{
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("DeadThreadOne is holding  LOCK 1...");
                try{
                  Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne is waiting for  LOCK 2...");
                synchronized (lock2){
                    System.out.println("DeadThreadOne is holding  LOCK 1 and Lock 2");
                }
            }

        }
    }

    private static class DeadThreadTwo extends Thread{
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("DeadThreadOne is holding  LOCK 2...");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne is waiting for  LOCK 1...");

                synchronized (lock1){
                    System.out.println("DeadThreadOne is holding  LOCK 1 and Lock 2");
                }

            }


        }
    }

}
