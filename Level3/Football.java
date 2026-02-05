package Level3;
import java.util.*;
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] height= new int[11];
        for(int i=0;i<height.length;i++){
            height[i]=(int)(Math.random()*101)+150;
            System.out.print(height[i]+" ");
        }
        System.out.println();
        System.out.println("Sum of players :"+playerSum(height));
        System.out.println("Mean of players :"+playerMean(height));
        System.out.println("Player with minimum height :"+minimumHeight(height));
        System.out.println("Player with tallest height :"+tallestHeight(height));
    }
    public static int playerSum(int [] height){
          int s=0;
        for(int player:height){
            s+=player;
        }
        return s;
    }
    public static double playerMean(int [] height){
        double mean=(double)playerSum(height)/height.length;
        return mean;
    }
    public static int minimumHeight(int [] height){
       int minimum=height[0];
       for(int h:height){
        if(h<minimum){
            minimum=h;
        }
       }
        return minimum;
    }
    public static int tallestHeight(int [] height){
       int maximum=height[0];
       for(int h:height){
        if(h > maximum){
            maximum=h;
        }
       }
        return maximum;
    }
}
