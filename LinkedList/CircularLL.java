package LinkedList;
public class CircularLL {
    Node head = null;
    private int size;
    
    CircularLL(){
        size=0;
    }

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        size++;
    }
    
}

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != head) {
            currNode = currNode.next;
        }

        newNode.next = head;
        head = newNode;
        currNode.next = newNode;
    }
    
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node currNode = head;

        while (currNode.next != head) {
            currNode = currNode.next;
        }
        currNode.next=newNode;
        newNode.next=head;
    }

    public void display(){
        if(head == null){
            System.out.print("null");
        }
        Node currNode=head;

        while(currNode.next != head){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println(currNode.data);
    }
    public void removeAtFirst(){
        if(head == null){
        return;
    }

    size--;
    if(head.next == head){  
        head = null;
        return;
    }
        Node currNode=head;
        while(currNode.next!=head){
            currNode=currNode.next;
        }
        head=head.next;
        currNode.next=head;
    }
    public void removeAtLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==head){ //single node
            head=null;
            return;
        }
        Node last=head.next;
        Node secondLast=head;
        while(last.next!=head){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=head;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        CircularLL list= new CircularLL();
        list.insertAtLast(4);
        list.insertAtFirst(0);
        list.insertAtFirst(7);
        list.insertAtFirst(9);
        list.display();
        list.removeAtFirst();
        list.display();
        list.removeAtLast();
        list.display();
        System.out.println("Size of list: "+list.getSize());

    }
}
