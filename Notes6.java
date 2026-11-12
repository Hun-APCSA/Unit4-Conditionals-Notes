public class Notes6 {

    public static void printStar(int i) {
        if (i % 2 == 0)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    public static void printRow(int row) {
        for (int col = 0; col < 11; col++) {
            printStar(col + row);
        }
    }

    public static void main(String[] args) {
        for (int row = 0; row < 9; row++) {
            printRow(row);
            System.out.println();
        }
    }
}
