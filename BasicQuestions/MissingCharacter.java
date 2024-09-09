import java.util.*;

public class MissingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();

        str1+=" ";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)!= str1.charAt(i)){
                System.out.println(str.charAt(i));
                break;
            }
        }
        sc.close();

    }
}
