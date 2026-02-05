import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int variable=sc.nextInt();
        int [] arr=new int[11];
        for(int i=1;i<=10;i++){
            arr[i]=variable*i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(variable + " * " + i +" = "+arr[i]);
        }
    }
}
