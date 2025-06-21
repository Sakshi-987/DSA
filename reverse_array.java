import java.util.*;

public class reverse_array {
    public static void reverse(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");

        }

        // reversed ..using in-builts method 

        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 12, 14, 6, 8, 10));
        // Collections.reverse(arr);

        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.print(arr.get(i) + " ");
        // }
    }
}
