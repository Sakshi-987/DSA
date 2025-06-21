import java.util.*;

public class heap_Sort {

    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int midIdx = i;
        if (left < size && arr[left] > arr[midIdx]) {
            midIdx = left;
        }
        if (right < size && arr[right] > arr[midIdx]) {
            midIdx = right;
        }
        if (midIdx != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[midIdx];
            arr[midIdx] = temp;

            heapify(arr, midIdx, size);
        }
    }

    public static void heapSort(int arr[]) {
        // step 1 -> build max heap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // step 2 -> push largest at end i.e 0th index element at last index
        for (int i = n - 1; i > 0; i--) {
            // swap largest i.e first with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 3 };
        heapSort(arr);

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
