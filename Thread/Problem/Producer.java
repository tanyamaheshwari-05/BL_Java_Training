package Thread.Problem;

public class Producer extends Thread {

    ProducerConsumer pc;
    Producer(ProducerConsumer pc){
        this.pc=pc;
    }
    public void run(){
        int i=1;
        while(true){
            this.pc.produceItem(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
