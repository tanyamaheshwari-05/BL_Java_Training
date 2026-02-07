package LinkedList;
public class CustomLL {
    Node head;
    private int size;

    CustomLL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }
        Node secondlastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.addFirst("good");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("She");
        list.printLL();
        list.addLast("girl");
        list.printLL();
        list.removeFirst();
        list.printLL();
        list.removeLast();
        list.printLL();
        System.out.println(list.getSize());

    }
}
  