package Recursion;

public class Pattern {
    public static void main(String[] args) {
        pattern1(4,0);
    }
    public static void pattern(int i, int j){
        if(i == 0){
            return;
        }
        if(j < i){
            System.out.print("* ");
            pattern(i,j+1);
        }
        else{
            System.out.println();
            pattern(i-1,0);
        }
    }
    public static void pattern1(int i, int j){
        if(i == 0){
            return;
        }
        if(j < i){
            pattern1(i,j+1);
            System.out.print("* ");

        }
        else{
            pattern1(i-1,0);
            System.out.println(" ");

        }
    }
}

