public class removeDuplicatesFromSorted {

    public static int removingDuplicates(int[] nums) {
        // Given an integer array nums sorted in non-decreasing order,
        // remove the duplicates in-place such that each unique element appears only
        // once.
        // do modification in original array only, return the size till the unique
        // elements only,
        // what it stores in remaining length doesn't matter.
        // also print unique elements in main function as in leetcode on returning size
        // it also verifies unique elements your array have.

        // array is sorted.
        int i = 0;
        // using 2-pointer approach
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                // as both ele r diff so 1st one is already stored in 0th index ,we stored ith index ele on next index;
            }
        }

        // hust for verifying unique elements.
        for(int j=0;j<=i;j++){
        System.out.print(nums[j] + " ");
        }
        System.out.println();

        return i+1; //i+1 , denotes the no. of unique elements array , bcs on every operation of diff ele i increased.
    }

    public static void main(String args[]) {
        int nums[] = { 1, 1, 2 };
        System.out.println(removingDuplicates(nums));

    }
}
