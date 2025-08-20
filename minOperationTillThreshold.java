public class minOperationTillThreshold {

    // You are given a 0-indexed integer array nums, and an integer k.
    // In one operation, you can remove one occurrence of the smallest element of
    // nums.
    // Return the minimum number of operations needed so that all elements of the
    // array are greater than or equal to k

    // 1st approch
    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                
                count++;
            }
        }
        return count;
    }

    // 2nd approch- by sorting
    public static int secondMethod(int nums[], int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 11, 10, 1, 3 };
        int k = 10;
        System.out.println(minOperations(nums, k));
        System.out.println(secondMethod(nums, k));
    }
}
