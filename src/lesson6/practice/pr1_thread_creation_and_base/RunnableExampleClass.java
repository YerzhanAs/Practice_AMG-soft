package lesson6.practice.pr1_thread_creation_and_base;

public class RunnableExampleClass implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Thread t=new Thread(new RunnableExampleClass());
        t.start();

    }




}
