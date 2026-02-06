package Level2;
import java.util.*;
public class Zara {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double []salary= new double[10];
        double []year= new double[10];
        double []bonus= new double[10];
        double []newSalary= new double[10];
        double totalbonus=0;
        double totaloldsalary=0;
        double totalnewsalary=0;
        for(int i=0;i<10;i++){
            System.out.println("Enter salary of "+(i+1) +"Employee");
            salary[i]=sc.nextDouble();
            System.out.println("Enter working year of "+(i+1) +"Employee");
            year[i]=sc.nextDouble();
            if(salary[i]<0 || year[i]<0){
                System.out.println("Invalid entered.");
                i--;
            }
        }
        for(int i=0;i<10;i++){
            if(year[i]>5){
                bonus[i]=salary[i]*0.5;
            }
            else{
                bonus[i]=salary[i]*0.2;
            }
            newSalary[i]=salary[i]+bonus[i];
            totalnewsalary+=newSalary[i];
            totalbonus+=bonus[i];
            totaloldsalary+=salary[i];
            System.out.println("Original Salary: "+totaloldsalary);
            System.out.println("New Salary after bonus: "+totalnewsalary);
            System.out.println("Bonus: "+totalbonus);
        }
    }
}
