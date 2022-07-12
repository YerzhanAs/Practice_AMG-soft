package lesson5.hw;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Phonebook {

    HashMap<String, TreeSet<String>> info=new HashMap<>();


    public void add(String name, String number){
        if(!info.containsKey(name))
            info.put(name,new TreeSet<String>(Arrays.asList(number)));
        info.get(name).add(number);
    }


    public TreeSet<String> getPhoneNumberByFio(String fio){
        return info.get(fio);
    }

    public Set<String> getAllInfo(){
        return info.keySet();
    }


    public void get(String name){
        if(info.containsKey(name)){
            System.out.println(name+" "+info.get(name));
        }else{
            System.out.println("There is no such data in the database");
        }
    }


}
