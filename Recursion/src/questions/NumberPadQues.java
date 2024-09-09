package questions;

import java.util.ArrayList;

public class NumberPadQues {
    public static void main(String[] args) {
//        numberPad("", "34");
        System.out.println(numberPadArrRet("", "56"));
    }

    static void numberPad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1) * 3; i< digit * 3; i++){
            char ch = (char) ('a' + i);
            numberPad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> numberPadArrRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1) * 3; i< digit * 3; i++){
            char ch = (char) ('a' + i);
            list.addAll(numberPadArrRet(p + ch, up.substring(1)));
        }
        return list;
    }
}
