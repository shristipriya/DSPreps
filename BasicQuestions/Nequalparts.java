import java.util.Scanner;

public class Nequalparts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int n1 = str.length()/n;
        int temp = 0;
        String [] str_final = new String[n1];
        if(str.length()%n != 0){
            System.out.println("Cannot be divisible");
        }
        else{
            for(int i = 0; i < str.length(); i = i + n1){
                String str1 = str.substring(i, i + n1);
                str_final[temp] = str1;
                temp++;
            }
            System.out.println("Equal parts of the string are:");
            for(String i : str_final){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
