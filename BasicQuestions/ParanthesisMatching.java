import java.util.Scanner;
import java.util.Stack;

public class ParanthesisMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpStr = sc.nextLine();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < inpStr.length(); i++) {
            if (inpStr.charAt(i) == '(' || inpStr.charAt(i) == '{' || inpStr.charAt(i) == '[') {
                st.push(inpStr.charAt(i));
                continue;
            }
            if (st.empty()) {
                System.out.println("Unbalanced");
                break;
            }
            char check = st.pop();
            switch (inpStr.charAt(i)) {
            case ')':
                if (check == '{' || check == '[') {
                    System.out.println("Unbalanced");
                }
                break;
            case '}':
                if (check == '(' || check == '[') {
                    System.out.println("Unbalanced");
                }
                break;
            case ']':
                if (check == '{' || check == '(') {
                    System.out.println("Unbalanced");
                }
                break;
            }

        }
        if (st.empty()) {
            System.out.println("Balanced");
        }
        sc.close();
    }
}
