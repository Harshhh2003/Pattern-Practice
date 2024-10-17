public class pattern15 {
    public static void main(String[] args) {
        int height = 7; // You can change this to make the 'H' taller or shorter
        int width = 5; // Width of the 'H'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || (i == height / 2 && j > 0 && j < width - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
