import java.util.*;
public class ZeroSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> s = new HashSet<>();
        int sum = 0;
        for(int e : arr){
            s.add(sum);
            sum += e;
            if(s.contains(sum)){
                found = true;
                break;
            }
        }
        System.out.println(found);
        sc.close();
    }
}
