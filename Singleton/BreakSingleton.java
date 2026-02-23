package Singleton;

import java.lang.reflect.Constructor;

public class BreakSingleton {
    private static BreakSingleton instance;
    private BreakSingleton(){
        if(instance!=null){
            throw  new RuntimeException("You are trying to break the singleton.");
        }
    }
    public static BreakSingleton getInstance(){
        if(instance==null){
            synchronized (BreakSingleton.class){
                if(instance==null){
                    instance=new BreakSingleton();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) throws Exception{
        BreakSingleton s1= BreakSingleton.getInstance();
        Constructor<BreakSingleton> constructor = BreakSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BreakSingleton s2= constructor.newInstance();
        System.out.println(s1==s2);

        
    }
}
