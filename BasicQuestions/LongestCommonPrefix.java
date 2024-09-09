public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        int flag = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    System.out.println(strs[0].substring(0, i));
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }

    }
}
