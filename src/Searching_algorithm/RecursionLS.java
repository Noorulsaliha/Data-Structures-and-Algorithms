package Searching_algorithm;

public class RecursionLS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println( RecursionLinear(arr,target,0,arr.length - 1));
    }
    public static int RecursionLinear(int[] array, int target, int start, int end){
        if(start >= end){
            return -1;
        }
        else if(array[start] == target){
            return start;
        }
        else if(array[end] == target){
            return end;
        }
        return RecursionLinear(array,target,start+1,end -1);
    }
}
