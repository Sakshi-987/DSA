import java.util.*;

public class Sorting {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        for (int turn = 0; turn < n - 1; turn++) {

            for (int i = 0; i < n - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapCount++;
                }
            }
            if (swapCount == 0)
                break;
        }
        // System.out.println(swapCount);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;

                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // storing that curr value in right position
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        // fiding largest elem
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // new count arr for storing freq and putting ele from 0 to largest as indices
        // in ascending order
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            // iterating on original array here
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = { 1,4,1,3,2,4,3,7 };
        System.out.print("bubble sort" + " -> ");
        bubbleSort(arr);
        printArr(arr);
        System.out.print("selection sort " + " -> ");
        selectionSort(arr);
        printArr(arr);
        System.out.print("insertion sort" + " -> ");
        insertionSort(arr);
        printArr(arr);
        System.out.print("Counting sort" + " -> ");
        countingSort(arr);
        printArr(arr);

    }
}