package Thread;

public class CreateThreadRunnable implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        CreateThreadRunnable thread= new CreateThreadRunnable();
        Thread th= new Thread(thread);
        th.start();
        
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Value of i : " + i);
        
       try {
          Thread.sleep(1000);   //delay the each execution for 1 second.

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
}
