//  right-aligned triangle pattern
import java.util.Scanner;
public class patter12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; i <= 6; i++) {
            // For spaces
            for(int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            // For printing stars
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
