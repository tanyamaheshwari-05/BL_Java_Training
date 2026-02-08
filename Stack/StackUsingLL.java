package Stack;

public class StackUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class Stack {
        static Node head;

        static boolean isEmpty() {
            return head == null;
        }

        static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        static int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;

        }

        static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }

        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            while (!st.isEmpty()) {
                System.out.println(st.peek());
                st.pop();
            }
        }
    }

}
