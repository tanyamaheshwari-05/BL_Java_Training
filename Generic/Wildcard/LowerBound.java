package Generic.Wildcard;
import java.util.*;
public class LowerBound {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,-2,3);
        sum(list1);
    }
    public static void  sum(List<? extends Integer>list){
     System.out.print(list);
    }
}

