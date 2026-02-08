package Queue;

public class CircularQueueUsingArray {
    static class Queue{
        static int rear;
        static int front=-1;
        static int[]arr;
        static int size;
        Queue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }
        static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        static boolean isFull(){
            return (rear+1)%size==front;
        }
        static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        static  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res=arr[front];
            //Single elements in circulare queue.
            if(rear==front){
                rear=front=-1;
            }
            else{
            front=(front+1)%size;
            }
            return res;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args) {
            Queue q=new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            System.out.println(q.remove());
            // while(!q.isEmpty()){
            //     System.out.println(q.peek());
            //     q.remove();
            // }
            q.add(5);
            System.out.println(q.remove());
            q.add(6);
            System.out.println(q.remove());
            q.add(7);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
                
            }


        }
    }
}
