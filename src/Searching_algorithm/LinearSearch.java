package Searching_algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 2;
        System.out.println(LinearSearch(arr,target));
    }
    public static int LinearSearch(int[] array, int num){
        for(int i = 0; i < array.length;i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }
}
