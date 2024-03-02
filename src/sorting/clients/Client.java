package sorting.clients;

import Utilities.ArrayUtility;
import sorting.alg.devideNConqure.MergeSort;
import sorting.alg.simpleSort.BubbleSort;
import sorting.alg.simpleSort.InsertionSort;
import sorting.alg.simpleSort.SelectionSort;


public class Client {
    public static void main(String[] args) {
        int[] arr = {14,21,56,23,18,28,78,98,15,46,35,25,29,33};
        InsertionSort.sort(arr);
        ArrayUtility.printArray(arr);
    }
}
