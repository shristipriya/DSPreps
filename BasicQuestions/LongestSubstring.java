import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// ni samajh aaya
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LengthLongestSubstring = 0;
        String LongestSubstring = null;
        String str = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch, i);
            }
            else{
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > LengthLongestSubstring){
                LengthLongestSubstring = map.size();
                LongestSubstring = map.keySet().toString();
            }
        }
        System.out.println(LongestSubstring);
        System.out.println(LengthLongestSubstring);
        sc.close();
    }
}
