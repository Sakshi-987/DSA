import java.util.*;

public class smallestPositiveMissing {
    public static int returnSamllestPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            // as we've to see +ve no. from one
            if (!set.contains(i + 1))
                return i + 1;
        }
        return nums.length + 1;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(returnSamllestPositive(nums));
    }
}
