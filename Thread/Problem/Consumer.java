package Thread.Problem;

public class Consumer extends Thread {
    ProducerConsumer pc;
    Consumer(ProducerConsumer pc){
        this.pc=pc;
    }
    public void run(){
        int i=1;
        while(true){
            this.pc.consumeItem(i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
