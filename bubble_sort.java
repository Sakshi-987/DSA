public class bubble_sort {

    public static void bubbleSort(int arr[]) {
        int swap = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                }

            }
            if (swap < 1) {
                break;
            }
        }
        System.out.println(swap);
        if (swap == 0) {
        System.out.println("already sorted array.");
        //in this case , time complexity will be O(n).
        } else {
        //in this case , time complexity will be O(n^2).
        System.out.println("not sorted array.");
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2 };
        bubbleSort(arr);
        printArr(arr);

    }
}
