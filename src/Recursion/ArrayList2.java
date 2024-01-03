package Recursion;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,5,6,7};
        int target = 5;
        int index = 0;
        ArrayList<Integer> ans = findAllIndex1(arr,target,index);
        System.out.println(ans);
    }
    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndex1(arr,target,index + 1);
        list.addAll(ans);
        return list;
    }
}
