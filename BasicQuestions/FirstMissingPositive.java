import java.util.HashSet;
import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> number = new HashSet<>(); // sort will happen
        int a = arr.length;

        for (int i : arr) {
            number.add(i);
            if (a == 1) {
                if ((i == 1) || (i == 0)) {
                    ans = i + 1;
                }
            }
        }
        for (int i = 1; i <= a + 1; i++) {
            if (!number.contains(i)) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
