package Singleton;

public class SingletonEager {
    static private SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        System.out.println("Constructor initially called");
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonEager s1 = SingletonEager.getInstance();
        SingletonEager s2 = SingletonEager.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
    }

}
