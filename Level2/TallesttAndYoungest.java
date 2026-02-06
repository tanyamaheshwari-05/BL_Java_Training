package Level2;
import java.util.*;
public class TallesttAndYoungest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] age =new int[3];
        int [] height=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the age of "+(i+1)+" friend");
            age[i]=sc.nextInt();
            System.out.println("Enter the height of "+(i+1)+" friends:");
            height[i]=sc.nextInt();
        }
        int young=0;
        int tallest=0;

        for(int i=0;i<3;i++){
            if(age[i]<age[young]){
                young=i;
            }
            if(height[i]>height[tallest]){
                tallest=i;
            }
         
        }
        System.out.println("Tallest height among three: "+tallest);
        System.out.println("Youngest  among three: "+young);

    }
}
