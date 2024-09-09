import java.util.Scanner;

public class OddEvenOnTwoHalvesOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, temp = 0;
        int j = arr.length - 1;

        while (j >= i) {
            // swap if found odd even combo at i and j
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            } else {
                if (arr[i] % 2 == 0) {
                    i++;
                }
                if (arr[j] % 2 == 1) {
                    j--;
                }

            }
        }
        for(int k : arr)
        System.out.println(k);
        sc.close();
    }
}
