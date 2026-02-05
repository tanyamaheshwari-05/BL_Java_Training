import java.util.*;
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] age=new int[11];
        System.out.print("Enter age of 11 student:");
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]<0){
                System.out.println("Invalid age");
            }
            if(age[i]>=18){
                System.out.println("Student can vote");
            }
            else{
                System.out.println("Student cannot  vote");
            }
        }
    }
}
