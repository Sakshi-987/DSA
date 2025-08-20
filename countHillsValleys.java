public class countHillsValleys {
    public static int countTotalHnV(int[] nums) {
        if (nums.length < 3)
            return 0; int count=0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            int left = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > nums[i]) {
                    left = 1;
                    break;
                } else if (nums[j] < nums[i]) {
                    left = -1;
                    break;
                }
            }
            // for finding next is greater or small
            int right = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    right = 1;
                    break;
                } else if (nums[j] < nums[i]) {
                    right = -1;
                    break;
                }
            }
            // checking if both left right exist but 
            if (left==right&& left!=0)count++;
        }
        return count;
    }

    public static void main(String args[]) {
        int[] nums1 = {2,4,1,1,6,5};
        int[] nums2 = {6,6,5,5,4,1};
        System.out.println(countTotalHnV(nums1));//out-3
        System.out.println(countTotalHnV(nums2));//out-0
    }
}