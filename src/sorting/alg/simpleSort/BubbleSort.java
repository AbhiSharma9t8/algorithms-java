package sorting.alg.simpleSort;

public class BubbleSort {

    public static void sort(int[] arr){
        int n = arr.length;
        sort(arr,n);
    }

    private static void sort(int[] arr, int n) {
        int i,j,temp;
        boolean swapped = false;
        for (i = 0; i < n-1; i++) {
            for (j = 0; j < n-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }


}
