package lesson4.List;

import java.util.*;

public class ArrayListE {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //----------------------------------------------------
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add(1, "А0");
        System.out.println(arrayList);
        arrayList.remove("E");
        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.sort((o1, o2) -> o1.length()-o2.length());


        ///--------------------------------------------------------------
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);

        //---------------------------------------------------------------

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("Е");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "А2");
        System.out.println("1. linkedList: " + linkedList);
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("2. linkedList: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("3. linkedList: " + linkedList);
        String val = linkedList.get(2);
        linkedList.set(2, val + " изменено");
        System.out.println("4. linkedList: " + linkedList);

    }
}
