import java.util.*;

public class missingNrepeated {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int range = n * n;
        HashMap<Integer, Integer> map = new HashMap<>();
        // elements are inserted along with their frequency
        for (int[] elements : grid) {
            for (int ele : elements) {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
        }

        // finding missing and repeated within range , put repeated key on index-0 and
        // missing on index-1
        int[] result = new int[2];
        for (int num = 1; num <= range; num++) {
            if (!map.containsKey(num)) {
                result[1] = num;
            }
            else if(map.get(num) == 2){
            result[0] = num;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int grid[][] = { { 1, 3 }, { 2, 2 } };
        // on an array, it prints its internal object representation (not its elements). To print the actual contents, 
        // you need to use: [ Arrays.toSring(method()); ] -> it'll print elements of
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }
}
