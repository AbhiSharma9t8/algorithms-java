package sorting.alg.simpleSort;

/*In selection sort we try to find the minimum value from the unsorted part of the array
* and then place it at first position of the unsorted part */
public class SelectionSort {

    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
