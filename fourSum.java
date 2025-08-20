import java.util.*;

public class fourSum {
    public static List<List<Integer>> fourSumPrblm(int arr[], int target) {
        // print the list of quadruple whose sum equals target, note: duplicate elements
        // are not allowed i.e same lements (same index elements should'nt be repear')
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                int p = j + 1, q = n - 1;
                while (p < q) {
                    long sum = 1L * arr[i] + arr[j] + arr[p] + arr[q];
                    if (sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[p], arr[q]));
                        p++;
                        q--;
                        while (p < q && arr[p] == arr[p - 1])
                            p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        p++;
                    }
                }
                while (j < n && arr[j] == arr[j - 1])
                    j++;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
    int[] arr = {1,0,-1,0,-2,2};
    int target = 0;
    System.out.println(fourSumPrblm(arr, target));
    }
}