package Inheritance;

public class Animal {
    String brand="rod wheeler";
    void sound(){
        System.out.println("Bark");
    }
}
class Dog extends Animal{
        String type="Dog";

        public static void main(String[] args) {
    Dog d1= new Dog();
    // Animal a = new Animal();
        d1.sound();
        
        System.out.println(d1.brand +" "+  d1.type);
    }
}
