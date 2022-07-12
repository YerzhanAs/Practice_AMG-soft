package lesson8.practice;

public class MainApp {
    public static void main(String[] args) {
         doSomething(()->{
             for (int i = 0; i < 5; i++) {
                 System.out.println("Java");
             }
         });

         doSomething(()-> System.out.println(100));
    }

    public static void doSomething(Runnable runnableObj){
        runnableObj.run();
    }
}
