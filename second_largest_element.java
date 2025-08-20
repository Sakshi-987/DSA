import java.util.*;

public class second_largest_element {

    public static int secondLargest(int arr[]) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE)? -1 : second;
    }

    public static void main(String args[]) {
        int arr[] = { 12, -35, -1, 10, 34, 1 };
        // 2nd ex:
        //  int arr[] = { 10,10,10};
        System.out.println("Second largest element is " + secondLargest(arr));
    }
}
