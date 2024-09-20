
// ******
// *****
// ****
// ***
// **
// * inverted rhs traingle code
 import java.util.Scanner;
public class pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:   ");
        int r = sc.nextInt();
        for(int i=r; i>=1; i--){
            for(int j =1; j<=r; j++){
                System.out.print("*");

            }System.out.println();
        }


    }
}