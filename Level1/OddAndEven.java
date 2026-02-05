import java.util.*;
public class OddAndEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr= new int[5];
        System.out.println("Enter 5 numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("Even number");
                }
                else{
                    System.out.println("Odd number");
                }
            }
            else if (arr[i]<0){
                System.out.println("Negative number");
            }
            else{
                System.out.println("Zero");
            }
        }
        if(arr[0]==arr[arr.length-1]){
            System.out.println("First and Last are equals");
        }
        else if(arr[0]>arr[arr.length-1]){
            System.out.println("first element is greater than Last element");
        }
        else{
            System.out.println("First element is less than last element");
        }
    }
}
