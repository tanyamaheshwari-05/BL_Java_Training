package Polymorphism;

public class Methodoverloading {
    public static void main(String[] args) {
        System.out.println("sum with 2 parameter: "+sum(5,6)); 
        System.out.println("sum with 3 parameter: "+sum(5,6,1)); 
    }

public static int sum(int a,int b){
    return a+b;
}
public static int  sum(int a,int b,int c){
    return a+b+c;
}

}
