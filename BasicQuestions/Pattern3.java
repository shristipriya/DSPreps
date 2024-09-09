import java.util.Scanner;

// left star pattern
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 2 * (n - i); j >= 0; j--) { // j = 0; j < n-i-1; j++
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // j = n; j >= n-i; j--
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
