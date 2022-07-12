package lesson4.generics;

public class GenBox <T>{
    private T obj;

    //ЗАПРЕЩЕНО СОЗДАВАТЬ ОБЬЕКТ ВНУТРИ КЛАССА И СТАТИЧЕСКИЕ ПОЛЯ

    public GenBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void showType() {
        System.out.println("Тип T: " + obj.getClass().getName());
    }

}
