package Queue;

public class CircularQueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty() {
            return head == null && tail == null;
        }

        static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            if (head == tail) {
                tail = null;
            }
            int remove = head.data;
            head = head.next;
            tail.next = head;
            return remove;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
