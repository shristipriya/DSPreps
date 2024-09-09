import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int c = 0;
        for(int k = 1; k <= input; k++){
            for (int i = 1; i <= input; i++) {
                if(k>1){
                    if(input-i <= c){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(i); 
                    } 
                }
                else{
                    System.out.print(i);
                }
                                                        
            }
            for (int j = input; j >= 1; j--) {
                if(k>1){
                    if(input-j <= c){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(j);
                    } 
                }
                else{
                    System.out.print(j);
                }
                               
            } 
            System.out.print("\n");
            if(k>1){
                c++;
            }
        
        } 
        sc.close();       
    }
}
