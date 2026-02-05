import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount");
        int principal=sc.nextInt();
          System.out.println("Enter rate");
        int rate= sc.nextInt() ;
          System.out.println("Enter time");
          int time= sc.nextInt() ;
          System.out.println("The Simple Interest is "+simpleInterest(principal,rate,time)+" for Principal " +principal+" ,Rate of Interest "+rate+" and Time "+time);

    }
    public static int simpleInterest(int principal,int rate,int time){
        int si=(principal *rate * time)/100;
        return si;

    }
}