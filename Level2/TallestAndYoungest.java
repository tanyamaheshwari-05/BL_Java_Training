package Level2;
import java.util.*;
public class TallestAndYoungest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names={"Amar","Akbar","Anthony"};
        int [] height = new int[3];
        int [] age= new int[3];
          for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
          }
        int youngestIndex = youngest(age);
        int tallestIndex = tallest(height);
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
        }
        public static int tallest(int height[]){
            int max=0;
            for(int i=1;i<height.length;i++){
                if(height[i]>height[max]){
                    max=i;
                }
            }
            return max ;
        }
        public static int youngest(int age[]){
            int min=0;
            for(int i=1;i<age.length;i++){
                if(age[i]<age[min]){
                    min=i;
                }
            }
            return min ;
        }
    }

