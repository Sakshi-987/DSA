import java.util.*;

public class singleNumber {
    // Given a non-empty array of integers nums, every element appears twice except
    // for one. Find that single one.
    // You must implement a solution with a linear runtime complexity and use only
    // constant extra space.

    // it takes O(n) T.C & O(n) S.C
    public static int findingNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer keys : map.keySet()) {
            if (map.get(keys) == 1) {
                return keys;
            }
        }
        return 0;
    }

    // T.C = O(n) & S.C = 1 =>most optimimum method
    // 0^1=1 while n^n=0 the conecpt used if same ele exist it cancels out to be 0 in result and only unique remains
    public static int secondMethod(int nums[]) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }
        return result;
        // step1: 0^4=4
        // step2: 4^1 = (0100)^(0001) = (0101) i.e 5
        // step3: 5^2 = (0101)^(0010) = (0111) i.e 7
        // step4: 7^1 = (0111)^(0001) = (0110) i.e 6
        // step5: 6^2 = (0110)^(0010) = (0100) i.e 4
        // so result = 4 unique element is 4.
        
    }

    public static void main(String args[]) {
        int nums[] = { 4, 1, 2, 1, 2 };
        System.out.println(findingNumber(nums));
        System.out.println(secondMethod(nums));
    }
}
