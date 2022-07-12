package lesson6.practice.pr3_synchronization;

public class SynchMethodApp {
    public static void main(String[] args) {
        SynchMethodApp e1 = new SynchMethodApp();
        System.out.println("Start");
        new Thread(() -> e1.method1()).start();// первый будет работать в 1 монторе (метод синхр)
        new Thread(() -> e1.method2()).start();// второй будет работать в 1 монторе (метод синхр)

        // два синхр метода будет работать последовательно в одном обьекте
        // метод 1 и 2 будет работать последовательно, метод 1 и 3 или 2 и 3 будет работать параллельно
    }

    public synchronized void method1() {
        System.out.println("M1 start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M1 end ");
    }

    public synchronized void method2() {
        System.out.println("M2 start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M2 end");
    }

    public  void method3() {
        System.out.println("M3 start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M3 end");
    }
}
