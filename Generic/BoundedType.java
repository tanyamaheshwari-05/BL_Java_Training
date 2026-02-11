package Generic;

public class BoundedType<T extends Number> {
    T num;
    BoundedType(T num){
        this.num=num;
    }

    double square(){
        return num.doubleValue()* num.doubleValue(); // .doubleValue is a method in NUMBER.
    }
    public static void main(String[] args) {
        BoundedType<Integer> i1=new BoundedType<>(4);
        BoundedType<Double> i2= new BoundedType<Double>(3.0);
        // BoundedType<String> i3= new BoundedType<String>("Hi");
        System.out.println(i1.square());
        System.out.println(i2.square());
    }
}
