package lesson7.practice.p_temp;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class AppTemp {
    public static void main(String[] args) {
        // vector аналог листа но с синхронизацей
        //не используется hashtable для многопоточности
        // ConcurrentHashMap лучший подходить для многопоточности,locks
        //Collections.synchronizedMap() не производительный чем ConcurrentHashMap

        //CopyOnWriteArrayList

        //
        AtomicInteger atomicInteger=new AtomicInteger(10);
        System.out.println( atomicInteger.addAndGet(10));

    }
}
