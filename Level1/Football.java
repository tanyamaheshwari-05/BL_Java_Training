import java.util.*;
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of 11 player : ");
        double array[] =new double[11];
        for(int i=0;i<11;i++){
            array[i]=sc.nextDouble();
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        double mean= (double)sum/11;
        System.out.println("Mean height of football player :"+mean);
    }
}
