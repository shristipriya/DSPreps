public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(600090));
    }

    static int countZeros(int n){
       return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }
        if(n % 10 == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
