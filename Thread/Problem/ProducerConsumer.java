package Thread.Problem;

public class ProducerConsumer {
    public static void main(String[] args) {
        ProducerConsumer company = new ProducerConsumer();
        Producer pr= new Producer(company);
        Consumer co= new Consumer(company);
        pr.start();
        co.start();

    }
    boolean f= false; //f = false --> chance: producer
                      // f= true --> chance: consumer
    int n;

    synchronized public void produceItem(int n){

        if(f){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        f=true;
        notify();

        this.n=n;
        System.out.println("Produced  items : "+this.n);
    }
    
    synchronized  public int consumeItem(int n){
        if(!f){
          try {
              wait();
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
        f=false;
        notify();
        System.out.println("Consume items : " +this.n); 
        return n;
    }
}
