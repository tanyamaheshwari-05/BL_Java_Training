package Generic.Wildcard;
import java.util.*;
public class UpperBound {
//     public static void main(String[] args) {
//         List<Integer> list1= Arrays.asList(10,3);
//         System.out.println("Tota sum is :"+sum(list1));
//         List<Double> list2= Arrays.asList(10.1,3.4);
//         System.out.println("Tota sum is :"+sum(list2));
//     }
//     public  static double sum(List<? extends Number>list){
//         double Sum=0;
//         for(Number i:list){
//             Sum+=i.doubleValue();
//         }
//         return Sum;
// }
public static void main(String[] args) {
    List<String> list=Arrays.asList("Apple","Banana");
   fun(list);
    
}
public static void fun(List<? extends String>list ){
   System.out.println("Processing list");
   for(String i:list){
    System.out.println(i);
   }

}
}
