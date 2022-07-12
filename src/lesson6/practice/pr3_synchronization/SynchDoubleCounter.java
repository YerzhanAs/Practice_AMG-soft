package lesson6.practice.pr3_synchronization;

public class SynchDoubleCounter {
    private long c=0;
    private long c2=0;

    private Object lock1=new Object();
    private Object lock2=new Object();

    public long value(){
        return c;
    }

    public long value2(){
        return c2;
    }

    public void inc(){
        synchronized(lock1) {
            c++;
        }
    }

    public void dec(){
        synchronized(lock1) {
            c--;
        }
    }

    public void inc2(){
        synchronized(lock2) {
            c2++;
        }
    }

    public void dec2(){
        synchronized(lock2) {
            c2--;
        }
    }
}
