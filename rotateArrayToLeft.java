public class rotateArrayToLeft {
    static void rotateArray(int arr[], int d) {
        int n = arr.length;
        if (d >= n) {
            d %= n;
        }

        // array of size 0 to d
        reverseArray(arr, 0, d - 1);
        // array of size (n-d) i.e from d to n-1
        reverseArray(arr, d, n - 1);
        // array of size 0 to n
        reverseArray(arr, 0, n - 1);

    }

    // T.C = O(n) & S.C = O(1)

    static void reverseArray(int arr[], int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // another approach
    public static void rotateArray2(int arr[], int d) {
        int n = arr.length;
        if (d >= n) {
            d %= n;
        }

        int temp[] = new int[n];

        for (int i = 0; i < n - d; i++) {
            temp[i] = arr[d + i];
        }

        for (int i = 0; i < d; i++) {
            temp[n - d + i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 9 };
        int d = 9;
        
        rotateArray(arr, d);

        // rotateArray2(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
