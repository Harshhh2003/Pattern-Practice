//   inverted right-aligned triangle 
public class patter13{
    public static void main(String[] args) {
        // int row =5;
        for(int i = 1; i <= 6; i++) {
            // For spaces
            for(int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            // For printing stars
            for(int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}