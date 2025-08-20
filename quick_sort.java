public class quick_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // recursive function
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kaam
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);// left
        quickSort(arr, pIdx + 1, ei);// right
    }

    // partition function
    public static int partition(int arr[], int si, int ei) {
        // pivot element
        int pivot = arr[ei];
        int i = si - 1; // to make place for smaller elemnts than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        i++;
        // for storing pivot elemant at its index
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String args[]) {
        int arr[] = { -2,6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
