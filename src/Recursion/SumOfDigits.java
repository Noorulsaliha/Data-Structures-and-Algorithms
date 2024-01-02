package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        //Sum Of Digits
        //Q: 1345 output:13
        System.out.println(Sum(123));
    }
    public static int Sum(int n){
        if(n == 0){
            return 0;
        }
        return Sum(n/10)+(n%10);
    }
}
