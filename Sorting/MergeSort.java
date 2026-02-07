public class MergeSort {
     static int[] arr={2,1,10,8,5,7,6};
     static int[]res = new int[arr.length];
    public static void main(String[] args) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        divide( left, right);
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void divide(int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            divide(left, mid);
            divide(mid+1, right);
            merge(arr,left,mid,right);
        }
    }
    static void  merge(int []arr ,int left,int mid,int right){
        int i=left;
        int k=left;
        int j=mid+1;
       while(i<=mid && j<=right){
        if(arr[i]<=arr[j]){
            res[k]=arr[i];
            i++;
        }
        else{
            res[k]=arr[j];
            j++;
        }
        k++;
       }
       if(j>right){
        while(i<=mid){
            res[k]=arr[i];
            i++;
            k++;
        }
       }
       else{
          while(j<=right){
            res[k]=arr[j];
            j++;
            k++;
        }
       }
       for(int r=left;r<=right;r++){
        arr[r]=res[r];
       }
        
    }

}
