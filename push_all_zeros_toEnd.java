public class push_all_zeros_toEnd {

    static void pushAllZeroesToEnd(int arr[]) {
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushAllZeroesToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
