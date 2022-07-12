package lesson5.practice;

import java.util.*;

public class Practice5 {
    public static void main(String[] args) {

        ///----------------------Map------------------------------------------
        ///---HashMap
        //представляет собой хеш-таблицу для хранения пар ключ-значение

        HashMap<String, String> hm = new HashMap<>();
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(11,"Qyzlylorda");
        hm1.put(5,"Almaty");
        hm.put("Russia", "Moscow");
        hm.put("France", "Paris");
        hm.put("Germany", "Berlin");
        hm.put("Norway", "Oslo");

        for (Map.Entry<Integer,String> o: hm1.entrySet()) {
            System.out.println(o.getKey());
        }
        for (Map.Entry<String, String> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        hm.put("Germany", "Berlin2");
        System.out.println("New Germany Entry: " + hm.get("Germany"));

        //Классы LinkedHashMap и TreeMap расширяют класс HashMap. LinkedHashMap сохраняет порядок
        //добавления записей, а TreeMap хранит пары «ключ-значение» в отсортированном порядке


        ///----------------------Set----------------------------------------
        ///---HashSet
        //add(), contains(), remove() и size()
        //Класс HashSet служит для создания коллекции, содержащей только уникальные элементы

        Set<String> set = new HashSet<>();
        set.add("Aльфa");
        set.add("Бета");
        set.add("Aльфa");
        set.add("Этa");
        set.add("Гaммa");
        set.add("Эпсилон");
        set.add("Oмeгa");
        set.add("Гaммa");
        System.out.println(set);

        ///---LinkedHashSet
        //использует связный список для сохранения порядка добавления в него элементов.
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Бета");
        set2.add("Бета");
        set2.add("Aльфa");
        set2.add("Этa");
        set2.add("Гaммa");
        set2.add("Эпсилон");
        set2.add("Oмeгa");
        System.out.println(set2);

        ///---TreeSet
        //Объекты сохраняются в отсортированном порядке по возрастанию.
        Set<String> set3 = new TreeSet<>();
        set3.add("C");
        set3.add("A");
        set3.add("B");
        set3.add("E");
        set3.add("F");
        set3.add("D");
        System.out.println(set3);

        ///--------------------------Итераторы-------------------
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "C", "A", "A", "B", "C", "B"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("A")) {
                iter.remove();
            }
        }
        System.out.println(list);

        ///---------------------Comparable--------------------
        List<Cat> cats = new ArrayList<>(Arrays.asList(
                new Cat("A", 5), new Cat("B", 2), new Cat("C", 4)
        ));
        System.out.println(cats);
        Collections.sort(cats);
        System.out.println(cats);



    }
}
