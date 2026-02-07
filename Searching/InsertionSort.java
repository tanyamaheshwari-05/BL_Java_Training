public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={9,10,8,5,3,6,1,7};
        int n=arr.length;
        System.out.println("Original  Array");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
        }
        for(int i=1;i<n;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
        System.out.println("\nSorted array");
        for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
        }
    }

}
