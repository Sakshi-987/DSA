import java.util.*;

public class majorityElement1 {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // print the element which exist more than (n/2) times
        for (Integer keys : map.keySet()) {
            if (map.get(keys) > n / 2) {
                return keys;
            }
        }

        return 0;
    }

    // optimal approach-> takes less time 
    public static int optimalApp(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                count++;
            }
            if(count > arr.length/2){
            return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
        System.out.println(optimalApp(nums));
    }
}
