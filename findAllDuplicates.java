import java.util.*;

public class findAllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
               ans.add(nums[i]);
            }
        }
        return ans;
    }

    // return all the duplicates element, each elemnt can occur at most 2 times.
    public static void main(String args[]) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
    }
}
