package Recursion;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,2};
        int index = 0;
        System.out.println(IsSorted(arr,index));
    }

    public static boolean IsSorted(int[] arr, int index){
            if (index == arr.length - 1) {
                return true;
            }
            return arr[index] < arr[index + 1] && IsSorted(arr, index + 1);

        }
}
