package lesson5.hw;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Task1 method 1
        String[] names={
                "Cat","Dog","Tiger","Bird","Kitten",
                "Hamster","Mouse","Tiger","Pag",
                "Cat","Cat","Tiger","Mouse","Dog"
        };

        HashMap<String,Integer> Animals=new HashMap<>();

        for (String name : names) {
            if(!Animals.containsKey(name)){
                Animals.put(name,1);
            }else{
                Integer count=Animals.get(name);
                Animals.put(name,++count);
            }
        }

        System.out.println(Animals.entrySet());

        //Task1 method 2
        findCountOfAnimal(names);

        //Task 2
        Phonebook phonebook1=new Phonebook();
        phonebook1.add("Yerzhan","8-707-185-88-35");
        phonebook1.add("Yerzhan","8-747-09-29-64");
        phonebook1.add("Balzhan","8-707-217-37-51");

        phonebook1.get("Yerzhan");

        System.out.println(phonebook1.getPhoneNumberByFio("Balzhan"));
        System.out.println( phonebook1.getAllInfo());

    }

    public static void findCountOfAnimal(String... arr){
      HashMap<String,Integer> map=new HashMap<>();

        for (String s : arr) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
        System.out.println(map.keySet());

    }
}
