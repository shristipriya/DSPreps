package strings;

public class SkipCharacter {
    public static void main(String[] args) {
        //skip("", "bcacad");
        System.out.println(skipReturn("bcacda"));
    }

    static void skip (String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        } else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skipReturn (String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipReturn(up.substring(1));
        } else{
            return ch + skipReturn(up.substring(1));
        }
    }

    static String skipApple (String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipReturn(up.substring(5));
        } else{
            return up.charAt(0) + skipReturn(up.substring(1));
        }
    }

    static String skipAppNotApple (String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipReturn(up.substring(3));
        } else{
            return up.charAt(0) + skipReturn(up.substring(1));
        }
    }
}
