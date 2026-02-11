package Generic.Wildcard;
import java.util.*;
public class Unbounded {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3);
        fun(list1);
        List<String> list2= Arrays.asList("Hi","Tanya","Bye");
        fun(list2);

    }
    public static void fun(List<?> list){
        System.out.println(list);
    }
}
