package sorting.alg.devideNConqure;

public class QuickSort {

    public static void sort(int[] arr) {
        sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr, int low, int high){
        if(low<high){
            /*pivotIndex is the position of the  selected pivot in the array when
            * the array is sorted for that pivot value */
            int pivotIndex = partition(arr,low,high);
            sort(arr,low,pivotIndex-1);//sort the left part of array recursively
            sort(arr,pivotIndex+1,high);//sort the right part of the array recursively
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i=0, j=0, temp=0;
        /*We have to traverse the whole array*/
        while(i<=high){
            if(arr[i] <= pivot){
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j++;
            }
            else{
                i++;
            }
        }

        return j-1;
    }


}
