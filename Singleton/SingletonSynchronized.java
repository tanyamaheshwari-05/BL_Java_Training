package Singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    public static SingletonSynchronized getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonSynchronized s= SingletonSynchronized.getInstance();
        SingletonSynchronized s2= SingletonSynchronized.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s==s2);
    }

}
