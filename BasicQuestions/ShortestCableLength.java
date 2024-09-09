import java.util.Scanner;

public class ShortestCableLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, sum1 = 0, sum2=0, totalLength=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                temp = i;
                for (int j = i + 1; j < n; j++) {
                    sum1 = sum1 + Math.abs(arr1[j] - arr1[temp]);
                    temp = j;
                }
                temp = i;
                for(int j = i-1; j >= 0;j--){
                    sum2 = sum2 + Math.abs(arr1[j] - arr1[temp]);
                    temp = j;
                }
                totalLength = sum1 + sum2;
                break;
            }

        }
        System.out.println(totalLength);
        sc.close();

    }
}
