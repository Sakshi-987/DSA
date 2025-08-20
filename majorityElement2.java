import java.util.*;

public class majorityElement2 {
    // better approach-> T.C = O(N) & S.C = O(N)
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                result.add(key);
            }
        }

        return result;
    }

    // better for short input , slow bcs of sorting - T.C = O(nlogn) & S.C=O(1)
    public static List<Integer> secondWay(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                count++;
            else {
                if (count > n / 3)
                    ans.add(arr[i - 1]);
                count = 1;
            }
        }
        if(count>n/3)ans.add(arr[n-1]);
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2 };
        System.out.println(majorityElement(nums));
        System.out.println(secondWay(nums));
    }
}