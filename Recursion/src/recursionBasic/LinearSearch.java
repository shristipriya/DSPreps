import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8,4,4,3,1};
//        System.out.println(findElement(arr, 91, 0));
//        System.out.println(findElementsIndex(arr, 91, 0));
//        System.out.println(findElementsIndexFromLast(arr, 1, arr.length-1));
//        System.out.println(list);
//        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    static boolean findElement(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return findElement(arr, target, index+1);

    }

    static int findElementsIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findElementsIndex(arr, target, index+1);

    }
    static int findElementsIndexFromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findElementsIndexFromLast(arr, target, index-1);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findElementsAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findElementsAllIndex(arr, target, index+1);
    }

    // by returning an arraylist

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    // without using the arraylist argument
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }


}
