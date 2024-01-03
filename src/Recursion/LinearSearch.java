package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
        int index = 0;
        System.out.println(LinearSearch(arr,target,index));
    }
    public static int LinearSearch(int[] arr, int target,int index){
        int length = arr.length -1;
        if(arr[index] == target){
            return index;
        }
        else if(arr[index] > length){
            return -1;
        }
        return LinearSearch(arr,target,index+1);
    }
}
