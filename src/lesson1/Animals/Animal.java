package lesson1.Animals;

public abstract class Animal {
    public static int count;

    protected String type;
    protected String name;

    protected int MaxRunDistance;
    protected int MaxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        MaxRunDistance = maxRunDistance;
        MaxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int distance){
        if(distance<=MaxRunDistance){
            System.out.println(type+" "+name+" "+" пробежал дистанцию "+distance+" m");
        }else{
            System.out.println(type+" "+name+" "+" не смог пробежать  дистанцию "+distance+" m");
        }
    };

    public void swim(int distance){
        if(distance==0){
            System.out.println(type+" "+name+" "+" не умет плавать ");
            return;
        }else if(distance<=MaxSwimDistance){
            System.out.println(type+" "+name+" "+"  смог проплыть "+distance+" m");
        }else{
            System.out.println(type+" "+name+" "+" не смог проплыть "+distance+" m");
        }
    }
}
