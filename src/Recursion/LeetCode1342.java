package Recursion;

public class LeetCode1342 {
    //1342. Number of Steps to Reduce a Number to Zero
    public static void main(String[] args) {
        System.out.println(NumberOfSteps(14));
    }
    public static int NumberOfSteps(int n) {
        return helper(n,0);
    }
    public static int helper(int n, int count){
        if(n==0){
            return count;
        }
        if(n%2 == 0){
            return helper(n/2,count+1);
        }
        else{
            return helper(n-1,count+1);
        }
    }
}