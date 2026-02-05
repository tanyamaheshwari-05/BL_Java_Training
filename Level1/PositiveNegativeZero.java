import java.util.*;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int number= sc.nextInt();
        System.out.print("The number you entered is (if negative : -1 , positive: 1, zero :0 ):"+checker(number));
    }
    static int checker(int number){
        if(number>0){
            return 1;
        }
        else if(number <0){
        return -1;
        }
        else 
            return 0;
    }
}

