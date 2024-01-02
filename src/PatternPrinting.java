public class PatternPrinting {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern1(int n){
        for(int row = 1; row<=n ; row++){
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int rows = 1; rows <= 2*n; rows++){
            int columns = rows > n ? 2 * n - rows : rows;
            for(int j = 1; j < columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = rows; columns <= n; columns++) {
                System.out.print(" ");
            }
            for (int columns = 1; columns<=rows;columns++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
