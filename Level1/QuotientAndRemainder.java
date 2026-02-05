import java.util.*;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2=sc.nextInt();
        int res[]= findRemainderAndQuotient(num1, num2);
        System.out.println("Quotient : "+res[0]);
        System.out.println("Remainder : "+res[1]);
    }
    public static int[] findRemainderAndQuotient(int num1,int num2){
        int quotient= num1/num2;
        int remainder= num1% num2;
        return new int[]{quotient,remainder} ;
    }
}
