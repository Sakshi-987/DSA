public class selection_sort {
    public static void selectionSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            // let min position smallest array find is turn ( when oth turn is going
            // ..smallest element will be at oth index for it)
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                //to print in dexreasing order replace the greater sign toward arr[j]
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;

        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArr(arr);
    }
}
