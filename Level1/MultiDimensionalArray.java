import java.util.*;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();
        System.out.println("Enter columns");
        int column=sc.nextInt();
        int [][]matrix= new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int []array=new int[row*column];
        int idx=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[idx++]=matrix[i][j];
        }
    }
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
    }
}
