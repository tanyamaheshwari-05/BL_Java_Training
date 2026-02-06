package Level2;
import java.util.*;
public class ArrayResizing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        long num=sc.nextLong();
        int maxDigit=10;
        int[] digit=new int[maxDigit];
        int idx=0;
        while(num>0){
            if(idx==maxDigit){
                maxDigit+=10;
                int[] temp=new int[maxDigit];
                for(int i=0;i<digit.length;i++){
                    temp[i]=digit[i];
                }
                 digit = temp;
            }
            digit[idx++] = (int)(num % 10);
            num /= 10;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<digit.length;i++){
            if(digit[i]>largest){
                secondLargest=largest;
                largest=digit[i];
            }
            else if(digit[i]>secondLargest && digit[i]!=largest){
                secondLargest=digit[i];
            }
        }
             System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}

