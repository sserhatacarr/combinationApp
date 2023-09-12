import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, totaln = 1, totalr = 1, totalnr = 1, result;
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the cluster.
        System.out.print("Enter the number of elements in the set (n): ");
        n = scan.nextInt();

        // Prompt the user to enter the number of element subsets desired.
        System.out.print("Enter the number of elements in the subset (r):  ");
        r = scan.nextInt();

        // Calculate the factorial of 'n'.
        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }

        // Calculate the factorial of 'r'.
        for (int k = 1; k <= r; k++) {
            totalr *= k;
        }

        // Calculate the factorial of 'n - r'.
        for (int j = 1; j <= n - r; j++) {
            totalnr *= j;
        }

        // Use the combination formula to calculate the number of subsets.
        result = totaln / (totalr * totalnr);

        // Display the result.
        System.out.println("Number of subsets : " + result);
    }
}

// Second way
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the set (n): ");
        n = scan.nextInt();

        System.out.print("Enter the number of elements in the subset (r): ");
        r = scan.nextInt();

        scan.close();

        // Calculate factorials using helper functions.
        long nFactorial = calculateFactorial(n);
        long rFactorial = calculateFactorial(r);
        long nMinusRFactorial = calculateFactorial(n - r);

        // Use the second combination formula to calculate the number of subsets.
        long result = nFactorial / (rFactorial * nMinusRFactorial);

        System.out.println("Number of subsets: " + result);
    }

    // Helper function for factorial calculation.
    private static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}*/
