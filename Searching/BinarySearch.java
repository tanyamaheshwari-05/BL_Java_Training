package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr ={2,3,4,5,6,7};
        int key=6;
        System.out.print(binarySearch(arr,key));
    }
    public static int binarySearch(int []arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>key){
                high=mid-1;
            }
            else if(arr[mid]==key){
                return mid;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }
}
