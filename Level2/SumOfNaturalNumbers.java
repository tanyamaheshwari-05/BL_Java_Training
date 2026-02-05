package Level2;
import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int recusriveSum = sumUsingRecursion(number);
        int formulaSum = sum(number);
          System.out.println("Sum using recursion: " + recusriveSum);
        System.out.println("Sum using formula: " + formulaSum);
        if(recusriveSum == formulaSum){
            System.out.println("Both methods give the same result. The computation is correct.");
        }
        else{
            System.out.println("The computation is incorrect.");
        }
        
    }
    static  int sumUsingRecursion(int number){
        if(number==1){
            return 1;
        }
        else{
        return number+ sumUsingRecursion(number-1) ;
        }
    }
    static int sum(int number){
        int Sum= number *(number+1)/2;
        return Sum;
    }
}
