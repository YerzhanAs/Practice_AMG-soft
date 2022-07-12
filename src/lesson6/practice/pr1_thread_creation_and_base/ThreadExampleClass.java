package lesson6.practice.pr1_thread_creation_and_base;

public class ThreadExampleClass extends Thread{
    // не позволять насле другим
    // вожможности много чем runnable
    //поднослеником класс не сработает thread

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread"+i);
            try{
                 Thread.sleep(500);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        Thread t=new ThreadExampleClass();
        //если испольовать run будет работать только код сверху
        t.start();//надо использовать start не run
        //здесь код будет работать параллельно
        for (int i = 0; i < 10; i++) {
            System.out.println("main"+i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }

        }


    }
}
