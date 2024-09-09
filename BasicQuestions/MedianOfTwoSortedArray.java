import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int index;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            arr3[i] = arr1[i];
            pos++;
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
            arr3[pos] = arr2[i];
            pos++;
        }
        for(int i =0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        if (arr3.length % 2 == 0) {
            index = (arr3.length + 1) / 2;
            System.out.println(arr3[index] + arr3[index + 1] / 2);
        } else {
            index = arr3.length / 2;
            System.out.println(arr3[index]);
        }

        sc.close();
    }
}
