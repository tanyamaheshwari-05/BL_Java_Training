package Level2;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int number=sc.nextInt();
        int temp=number;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int [] digit=new int[count];
        temp=number;
        for(int i=0;i<count;i++){
            digit[i]=temp%10;
            temp/=10;
        }
        System.out.println("Reverse Order:");
        for(int i=0;i<digit.length;i++){
            System.out.print(digit[i]);
        }
    }
}
