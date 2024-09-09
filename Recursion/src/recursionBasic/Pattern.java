public class Pattern {
    public static void main(String[] args) {
        pattern(4, 1);
    }

    static void pattern(int n, int i){
        if(n == 0){
            return;
        }
        if(i<= n){
            System.out.print("*");
            pattern(n, i+1);

        }else{
            System.out.println();
            pattern(n-1, 1);
        }
    }

    static void pattern2(int n, int i){
        if(n == 0){
            return;
        }
        if(i<= n){
            pattern2(n, i+1);
            System.out.print("*");

        }else{
            pattern2(n-1, 1);
            System.out.println();
        }
    }
}
