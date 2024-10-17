public class pattern14{
public static void main(String[] args) {

    for(int i=1; i<=6; i++){
        for(int j =6; j>=i; j++){
            System.out.println(" ");

        } 
        //  for stars 
        for(int h =1; h<6; h++){
            System.out.println("* ");
        }System.out.println();
    }
    for(int i=1; i<=6; i++){
        for(int j =1; j<=i; j++){
            System.out.println(" ");

        } 
        //  for stars 
        for(int h =6; h>=i;h--){
            System.out.println("* ");
        }System.out.println();
}
}
}