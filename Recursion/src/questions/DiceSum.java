package questions;

public class DiceSum {
    public static void main(String[] args) {
        diceSum("", 4);
    }

    static void diceSum(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<= 6; i++){
            if(i <= target){
                diceSum(p + i, target - i);
            }
        }
    }
}
