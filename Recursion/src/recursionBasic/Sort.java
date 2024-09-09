import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {8,2,1,10,5,11};
//        bubbleSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        selectionSort(arr, 0, arr.length, 0);
//        System.out.println(Arrays.toString(arr));
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//        mergeSortInPlace(arr, 0, arr.length);
//        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int index, int pass){
        if(pass == 0){
            return;
        }
        if(index < pass){
            if(arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            bubbleSort(arr, index+1, pass);
        }else{
            bubbleSort(arr, 0, pass-1);
        }
    }

    static void selectionSort(int[] arr, int c, int r, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionSort(arr, c+1, r, c);
            }else{
                selectionSort(arr, c+1, r, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, 0,r-1,0);
        }
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] leftArr = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftArr, rightArr);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < first.length && j <second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = first[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s+e)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l=0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }

    static void quickSort(int[] arr, int low, int high){
        if( low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = (s+e)/2;
        int pivot = arr[m];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

            quickSort(arr, low, e);
            quickSort(arr, s, high);
        }
    }
}
