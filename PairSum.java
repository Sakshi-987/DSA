import java.util.*;

public class PairSum {

    public static List<Integer> byBruteApproach(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();

        // time complexity - O(n^2)

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        return ans; // returning if no pair found
    }

    static List<Integer> by2Pointer(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();

        // time complexity - O(n)


        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int pairSum = arr[i] + arr[j];

            if (pairSum > target) {
                j--;
            } else if (pairSum < target) {
                i++;
            } else {
                ans.add(i);
                ans.add(j);

                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(byBruteApproach(arr, target));
        System.out.println(by2Pointer(arr, target));
    }
}
