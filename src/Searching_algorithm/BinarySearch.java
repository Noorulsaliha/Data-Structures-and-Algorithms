package Searching_algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,56,78,90,34,12,344};
        int target = 23;
        System.out.println(BinarySearch(arr,target));
    }
    public static int BinarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > array[array.length -1]){
                return -1;
            } else if (array[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
