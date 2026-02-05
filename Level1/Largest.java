import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1= sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2= sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3= sc.nextInt();
        int large[]=findSmallestAndLargest(num1, num2, num3);
        System.out.println("Maximum from "+ num1+" " + num2+" " + num3 +" is :"+large[0]);

    }
    public static int[] findSmallestAndLargest(int num1, int num2, int num3){
        int max= 0;
        if(num1>num2 && num1>num3){
            max=num1;
        }
        else if(num2> num1 && num2>num3){
            max=num2;
        }
        else{
            max=num3;
        }

        return new int[]{max};

    }
}
