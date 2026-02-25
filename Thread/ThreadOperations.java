package Thread;
import java.lang.*;
public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program started ");
        Thread t = Thread.currentThread();

        // getName
        String tname = t.getName();
        System.out.println("Name of thread that are execute : " + tname);

        // setName
        t.setName("MyThread");
        System.out.println("New name updated for running thread  : " + t.getName());

        // thread sleep
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println(t.getId());
        System.out.println("Program ended ");
    }
}
