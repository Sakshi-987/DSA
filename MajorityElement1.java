import java.util.*;

public class MajorityElement1 {

    static int byBruteApproach(int[] nums) {
         // time complexity = O(n^2)
        int n = nums.length;
        for (int val : nums) {
            int freq = 0;
            for (int el : nums) {
                if (el == val) {
                    freq++;
                }
            }
            if (freq > n / 2) {
                return val;
            }
        }

        return -1;
    }

    static int byOptimalApproach(int[] nums) {
         // time complexity = O(nlog(n))
        int n = nums.length;
        Arrays.sort(nums);
        int freq = 1;
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                freq = 1;
                ans = nums[i];
            }

            if (freq > n / 2) {
                return ans;
            }
        }

        return -1;
    }

    static int byMooreVotingApproach(int[] nums) {
        // time complexity = O(n)
        int n = nums.length;

        int freq = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        int count = 0;
        for (int val : nums) {
            if (val == ans) {
                count++;
            }
        }

        ans =(count > n/2)? ans: -1;

        return ans;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 2, 3, 1, 1, 4, 1, 1, 3 };
        System.out.println(byBruteApproach(arr));
        System.out.println(byOptimalApproach(arr));
        System.out.println(byMooreVotingApproach(arr));
    }
}