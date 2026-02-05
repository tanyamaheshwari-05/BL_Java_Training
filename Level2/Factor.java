package Level2;
import java.util.*;
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = sc.nextInt();
        int []factor=numberFactors(number);
        System.out.print("Factors of a : ");
        for(int f:factor){
            System.out.print(f+" ");
        }
        System.out.println();
        int Sum = sum(factor);
        int Multiply = multiply(factor);
        int square=squareSum(factor);
        System.out.println("Sum of factor arr : "+Sum);
        System.out.println("Multiplication of factor arr : "+Multiply);
        System.out.println("Square sum of factor arr : "+square);


    }
    static int[] numberFactors(int number){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number % i==0){
                count++;
            }
        }
        int [] factor= new int[count];
        int index=0;
        for(int i=1;i<=number;i++){
            if(number%i ==0){
                factor[index++]=i;
            }
        }
        return factor;
    }
    static int sum(int factor[]){
        int sum=0;
        for(int i=0;i<factor.length;i++){
            sum+=factor[i];
        }
        return sum;
    }
    static int multiply(int factor[]){
        int multiple=1;
        for(int i=0;i<factor.length;i++){
        multiple *=factor[i];
        }
        return multiple;
    }
    static int squareSum(int factor[]){
        int sqSum=0;
        for(int i=0;i<factor.length;i++){
            sqSum+=Math.pow(factor[i],2);
        }
        return sqSum;
    }
}


