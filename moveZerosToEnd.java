public class moveZerosToEnd {

    public static void movingZerosBack(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        while(count<nums.length){
        nums[count] = 0;
        count++;
        }
    }

    public static void main(String args[]) {
        int[] nums = { 0, 1, 0, 3, 12 };
        movingZerosBack(nums);
        for(int i=0; i<nums.length;i++){
        System.out.print(nums[i] + " ");
        }
    }
}
