package Level2;
import java.util.*;
public class Random4Digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int numbers[]=generate4DigitRandomArray(size);
        System.out.print("Random Numbers: ");
        for (int n : numbers)
            System.out.print(n + " ");
        System.out.println();
        double res[] = findAverageMinMax(numbers);
         System.out.println("Average: " + res[0]);
        System.out.println("Minimum: " + (int) res[1]);
        System.out.println("Maximum: " + (int) res[2]);
    }
      public static int[] generate4DigitRandomArray(int size) {
        int [] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
      }
      public static double[] findAverageMinMax(int[] numbers) {
        int max=numbers[0];
        int min=numbers[0];
        int sum=0;
        for(int n:numbers){
            max=Math.max(max,n);
            min=Math.min(min,n);
            sum+=n;
        }
        double avg=(double) sum/numbers.length;
        return new double[]{avg,max,min};
      }
}
