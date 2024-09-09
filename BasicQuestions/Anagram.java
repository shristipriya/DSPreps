import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()){
            System.out.println("Both are not Anagram");
        }
        else{
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char[] str1char = str1.toCharArray();
            char[] str2char = str2.toCharArray();

            Arrays.sort(str1char);
            Arrays.sort(str2char);

            if(Arrays.equals(str1char, str2char) == true){
                System.out.println("Anagram");
            }
            else{
                System.out.println(("Not Anagram"));
            }

            
        }
        sc.close();
    }
}
