// 123456
// 234561
// 345612
// 456123
// 561234
// 612345
import java.util.Scanner;
public class pattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows :    ");
int r = sc.nextInt();
for(int i=1; i<=r; i++){
    for(int j =i; j<= r; j++){
        System.out.print(j);
    } for (int k =1; k< i; k++){
        System.out.print(k);
    }System.out.println();
}
    }
}