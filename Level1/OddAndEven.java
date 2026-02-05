// Write a program to take user input for 5 numbers and check whether a number is positive,
// negative, or zero. Further for positive numbers check if the number is even or odd. Finally
// compare the first and last elements of the array and display if they equal, greater or less
// Hint =>
// a. Define an integer array of 5 elements and get user input to store in the array.
// b. Loop through the array using the length If the number is positive, check for even or odd
// numbers and print accordingly
// c. If the number is negative, print negative. Else if the number is zero, print zero.
// d. Finally compare the first and last element of the array and display if they equal, greater
// or less
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
