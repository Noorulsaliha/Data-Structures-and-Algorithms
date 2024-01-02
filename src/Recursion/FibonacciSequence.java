package Recursion;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibo(3));
        //Normal Implementation
        int n1 = 1;
        int n2 = 1;
        int n = 5;
        if(n == 1|| n == 2){
            System.out.println(n);
        }
        else{
            for(int i = 3; i<= n; i++){
                int nthterm = n1 + n2;
                n1 = n2;
                n2 = nthterm;
            }
            System.out.println(n2);
        }
    }
    //Recursion Implementation
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
