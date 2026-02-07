package LinkedList;
import java.util.*;
public class BuiltInLL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("list");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);
        list.addLast("too");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
}
