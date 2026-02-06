package Level2;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int count=0;
        int temp=number;
        while(temp>0){
            count++;
            temp/=10;
        }
        int[] digits= new int[count];
        temp=number;
        for(int i=0;i<count;i++){
            digits[i]=temp%10;
            temp/=10;
        }
        int [] freq=new int[10];
        for(int d:digits){
            freq[d]++;
        }
        System.out.println("Frequency");
        for(int i=0;i<10;i++){
            if(freq[i]>0){
                System.out.println(i+"->"+freq[i]);
            }
        }

    }
}
