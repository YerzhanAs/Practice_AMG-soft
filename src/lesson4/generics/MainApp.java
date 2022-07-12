package lesson4.generics;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        //Обобщеные классы, методы, интерфейсы

        //part 1
        SimpleBox intBox1 = new SimpleBox(20);
        SimpleBox intBox2 = new SimpleBox(30);

        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {

            int sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
            System.out.println("sum = " + sum);

        } else {
            System.out.println("Содержимое коробок отличается по типу");
        }

        // вызываем какой-нибудь метод, которому отдаём intBox1,
        // и этот метод кладёт в коробку String
        // intBox1.setObj("Java");
        // продолжаем наш код и при выполнении получим ClassCastException
        // int secondSum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();


        //--------------------------------------------------------------------------------------------------------------
        //part 2
        GenBox<String> genStr = new GenBox<>("Hello");
        genStr.showType();
        System.out.println("genStr.getObject(): " + genStr.getObj());

        GenBox<Integer> genInt = new GenBox<>(140);
        genInt.showType();
        System.out.println("genInt.getObject(): " + genInt.getObj());

        int valueFromGenInt = genInt.getObj();
        String valueFromGenString = genStr.getObj();
        System.out.println(valueFromGenInt+" "+valueFromGenString);
        // genInt.setObj("Java"); // Ошибка компиляции !!!

        //-------------------------------------------------------------
        //part 3

        BoxWithNumbers<Integer> intBox=new BoxWithNumbers<>(1,2,3,4,5,6);
        System.out.println(intBox.average());

        BoxWithNumbers<Integer> intBox3=new BoxWithNumbers<>(1,2,3,4,5,6);
        System.out.println(intBox.average());

        BoxWithNumbers<Float> floatBox=new BoxWithNumbers<>(1.0f,2.0f,3.0f,4.0f,5.0f,6.0f);
        System.out.println(floatBox.average());

        System.out.println(intBox.compareAverage(floatBox));

        //-------------------------------------------------------------
        //part 4

        GenBox<Number> gbn=new GenBox<>(1);
        doSomething(gbn);
        doSomething2(gbn);

        GenBox<Integer> gbn2=new GenBox<>(1);
        doSomething(gbn2);
        //doSomething2(gbn2); ошибка

        //GenBox<Number> gbn3=new GenBox<Integer>(1); нельзя так делать


    }

    //Обобщеные интерфейсы
    public static <T extends Number> T getFirstNumber(List<T> list){
      return list.get(0);
    }

    public static void doSomething(GenBox<? extends Number> box){

    }

    public static void doSomething2(GenBox<Number> box){

    }

    public static void doSomething3(GenBox<? super Number> box){

    }


}
