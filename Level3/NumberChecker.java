package Level3;
import java.util.*;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int number =sc.nextInt();
        int[] digits=digitStore(number);
        System.out.println("Digit count : " + digits.length);
        System.out.println("Digits: ");
        for (int d : digits){
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("Duck number :"+duckNumber(digits));
        System.out.println("Armstrong number :" +armstrongNumber(digits,number));
        largestAndSecondLargest(digits);
        smallestAndSecondSmallest(digits);
    }
    public static int digitCount(int number){
        int count=0;
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }
     public static int[] digitStore(int number){
        int []digits=new int[digitCount(number)];
        int i=digitCount(number)-1;
        while(number>0){
            digits[i--]=number%10;
            number/=10;
        }
        return digits;
     }
    public static boolean duckNumber(int []digits){
        for(int d:digits){
            if(d !=0){
                return true;
            }
        }
        return false;
    }
    public static boolean armstrongNumber(int []digits,int original){
        int power=digits.length;
        int sum=0;
        for(int a:digits){
            sum+=Math.pow(a,power);
        }
        return sum==original?true:false;
    }
    public static void largestAndSecondLargest(int [] digits){
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        for(int l:digits){
            if(l>largest){
                secondLargest=largest;
                largest=l;
            }
            else if(l>secondLargest && l!=largest){
                secondLargest=l;
            }
        }
        System.out.println("Largest digit : "+largest);
        System.out.println(" Second Largest digit : "+secondLargest);
    }
    public static void smallestAndSecondSmallest(int [] digits){
        int smallest= Integer.MAX_VALUE;
        int secondsmallest= Integer.MAX_VALUE;
        for(int l:digits){
            if(l<smallest){
                secondsmallest=smallest;
                smallest=l;
            }
            else if(l<secondsmallest && l!=smallest){
                secondsmallest=l;
            }
        }
        System.out.println("Smallest digit : "+smallest);
        System.out.println(" Second Smallest digit : "+secondsmallest);
    }
}
