package Searching_algorithm;

public class RecursionBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (end < start) {
            return -1;
        }

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return BinarySearch(arr, target, mid+1, end);
        }
        return BinarySearch(arr, target, start, mid -1);

    }
}
