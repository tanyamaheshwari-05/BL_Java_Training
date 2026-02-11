package Generic;

public class Box<T> {
    T container;
    Box(T container){
        this.container=container;
    }
    public T getValue(){
        return this.container;
    }
    public static void main(String[] args) {
        Box<String> b1= new Box<>("123");
        Box<Integer> b2=new Box<>(123);
        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
    }
}

