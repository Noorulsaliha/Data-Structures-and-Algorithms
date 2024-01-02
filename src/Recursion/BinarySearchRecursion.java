package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 8;
        System.out.println(Search(arr,target,0,arr.length-1));

    }
    public static int Search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;

        if (arr[middle] == target) {
            return middle;
        } else if (target < arr[middle]) {
            return Search(arr, target, start, middle - 1);
        }
        return Search(arr, target, middle + 1, end);
    }
}
