import java.util.*;

public class findOnlyDuplicates {

// return the no. exist more , return that element , only one element is duplicate.
    public static int findingDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 3, 4, 2, 2 };
        System.out.println(findingDuplicates(nums));
    }
}