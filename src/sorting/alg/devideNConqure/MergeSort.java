package sorting.alg.devideNConqure;

public class MergeSort {

    public static void sort(int[] arr){
        int[] temp = new int[arr.length];
        sort(arr,temp,0,arr.length-1);
    }

    private static void sort(int[] arr, int[] temp, int low, int high){
        if(low<high) {
            int mid = low + (high - low) / 2;
            sort(arr, temp, low, mid); //sort the left of the midIndex
            sort(arr, temp, mid + 1, high); //sort the right of the midIndex
            merge(arr, temp, low, mid, high); //merge two sorted sub arrays
        }
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {

        for(int i=low; i<=high; i++){
            temp[i] = arr[i];
        }

        int i = low; int j = mid+1; int k = low;
        while(i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        /*If Left part of it is exhausted, then right part is already 
        * sorted in the original Array.
        * If Right part is exhausted then all the left-over values from 
        * left array are copied as it is.*/
        while(i<=mid){
            arr[k] = temp[i];
            i++;
            k++;
        }

    }

}
