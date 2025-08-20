import java.util.*;

public class twoSum2 {
    // Given a 1-indexed array of integers numbers that is already sorted in
    // non-decreasing order, find two numbers such that they add up to a specific
    // target number. Let these two numbers be numbers[index1] and numbers[index2]
    // where 1 <= index1 < index2 <= numbers.length.

    // Return the indices of the two numbers, index1 and index2, added by one as an
    // integer array [index1, index2] of length 2.

    // The tests are generated such that there is exactly one solution. You may not
    // use the same element twice.
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                if (i < map.get(comp)) {
                    return new int[] { i + 1, map.get(comp) + 1 };
                }else{
                    return new int[]{map.get(comp)+1, i+1};
                }
            }
            map.put(arr[i],i);
        }

        return new int[]{};
    }

    public static void main(String args[]) {
    int[] arr = {2,7,11,15};
    int target = 9;
    System.out.println(Arrays.toString(twoSum(arr, target))); //as normal array can't be printed directly either you've to convert it into String or print it using loops
    }
}