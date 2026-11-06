import java.util.Scanner;

public class Notes5 {

    public static int sumUp(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumUpRecursive(int n) {
        if (n == 0)
            return 0;
        else
            return n + sumUpRecursive(n - 1);
    }

    public static void main(String[] args) {
        // used to get user input
        Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        String name = "Baier";

        // input-controlled loop
        while (!name.equals("Baier")) {
            System.out.println("No");
            name = in.nextLine();
        }
        System.out.println("Yes!");

        // counter-controlled loop
        // count up by 1's from 1 to 5
        int i = 1; // initialize
        while (i <= 5) { // test
            System.out.println(i);
            i++; // update
        }
        System.out.println();
        // We can initialize, test, and update in one line
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
        }
        System.out.println();
        System.out.println(sumUp(5));

        // Recursive algorithm to sum from 1 to n
        // sumUp(5) = 5 + sumUp(4)
        // sumUp(4) = 4 + sumUp(3)
        // sumUp(3) = 3 + sumUp(2)
        // sumUp(2) = 2 + sumUp(1)
        // sumUp(1) = 1 + sumUp(0)
        // sumUp(0) = 0
        System.out.println(sumUpRecursive(5));

    }
}
