import java.util.*;

public class LongestSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, currentSum = 0;
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > max){
                max = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
