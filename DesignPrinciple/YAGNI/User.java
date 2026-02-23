package DesignPrinciple.YAGNI;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Future use: this is not allowed in YAGNI Principle
    // public String encrypted(){
    // return "Encrypted_" + name;
    // }
    // //Maybe needed in future.
    // public void connectToCloud(){
    // System.out.println(name+" connected to cloud ");
    // }
    public static void main(String[] args) {
        User u = new User("Tanya");
        System.out.println(u.getName());
    }

}
