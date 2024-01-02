package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        Reverse(12345);
    }
    public static int Reverse(int n){
        if(n==0){
            return 0;
        }

        System.out.print(n % 10);
        return Reverse(n/10);
    }
}
