import java.util.Scanner;
public class patterpra{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows    :  "); int r = sc.nextInt();
        // System.out.println("enter the column  :     "); int c = sc.nextInt();
        for(int i=1; i<=r; i--){
            for( int j=1; j<r; j++){
                System.out.println("*");

            } System.out.println();
        }
    }

}
   
    
