public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {3,4,5,9,10,100};
        System.out.println(sortedOrNot(arr, 0));
    }

    static boolean sortedOrNot(int[] arr, int index){
        if(arr[index] == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return sortedOrNot(arr, index+1);
        }
        return false;

    }
}
