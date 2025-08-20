import java.util.*;

public class twoSum {
    public static int[] twoSumprblm(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                return new int[] { i, map.get(comp) };
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

    public static void main(String args[]){
    int arr[] = {2,4,3};
    int target = 6;
    System.out.println(Arrays.toString(twoSumprblm(arr, target)));
    }
}
