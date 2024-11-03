public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; /

        for (int i = 1; i <= n; i++) {
            // Print spaces  1st 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
         // print number then after printing space
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
           
            System.out.println();
        }
    }
}
