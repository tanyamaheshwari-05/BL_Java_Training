import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: " );
        int n=sc.nextInt();
        String[] arr=new String[n+1];
        for(int i=0;i<=n;i++){
            if(i%3==0){
                arr[i]="Fizz";
            }
            else if(i %5 ==0){
                arr[i]="Buzz";
            }
            else if(i%3==0 && i%5==0){
                arr[i]="FizzBuzz";
            }
            else{
                arr[i]=String.valueOf(i);
            }
        }
        for(int i=0;i<=n;i++){
            System.out.println("Position "+i+"="+arr[i]);
        }
    }
}
