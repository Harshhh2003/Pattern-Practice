// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
// 123456
// 12345
// 1234
// 123
// 12
// 1 pattern question
import java.util.Scanner;
public class pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:    ");
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }System.out.println();
        } for(int i=r; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print(j);
            } System.out.println();
        }
    }
}