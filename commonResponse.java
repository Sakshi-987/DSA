import java.util.*;

public class commonResponse {

    // find the most common element in 2-d array after removing duplicates from each
    // subarray.
    // Input: responses =
    // [["good","ok","good","ok"],["ok","bad","good","ok","ok"],["good"],["bad"]]
    // Output: "good"
    // Explanation:
    // After removing duplicates within each list, responses = [["good", "ok"],
    // ["ok", "bad", "good"], ["good"], ["bad"]].
    // "good" appears 3 times, "ok" appears 2 times, and "bad" appears 2 times.
    // Return "good" because it has the highest frequency.

    public static String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> map = new HashMap<>();
        for (List<String> response : responses) {
            Set<String> unique = new HashSet<>(response); // remove all duplicates

            // putting left into map
            for (String ele : unique) {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
                // all elements are added into single map
            }
        }

        // tracking the most common one
        int maxFreq = 0;
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            String key = entry.getKey();

            if (freq > maxFreq || (freq == maxFreq && key.compareTo(result) < 0)) {
                result = key;
                maxFreq = freq;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        
         List<List<String>> responses = Arrays.asList(
            Arrays.asList("good", "ok", "good", "ok"),
            Arrays.asList("ok", "bad", "good", "ok", "ok"),
            Arrays.asList("good"),
            Arrays.asList("bad")
        );

        System.out.println(findCommonResponse(responses));
    }
}