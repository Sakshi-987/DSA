import java.util.*;

public class mostFreqElement {

    // finding most freq even element if tie exist, print the smallest one.
    public static int freqEvenEle(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int result = -1, maxFreq = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFreq || (freq == maxFreq && key < result)) {
                result = key;
                maxFreq = freq;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int nums[] = { 0, 1, 2, 2, 4, 4 };
        System.out.println(freqEvenEle(nums));
    }
}
