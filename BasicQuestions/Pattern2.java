import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
            if (i == n) {
                for (int k = n - 1; k >= 1; k--) {
                    for (int l = 1; l <= k; l++) {
                        System.out.print(l);
                    }
                    System.out.print("\n");
                }

            }
        }
        sc.close();
    }
}
