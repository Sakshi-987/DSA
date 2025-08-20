import java.util.*;

public class containerWithMostWater {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // brute force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // optimized way of finding most water container
    // 2-pointer approach
    public static int maxWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // move the pointer of the smaller height
            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        // 1,8,6,2,5,4,8,3,7
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(4);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(storeWater(height));

        // 2 pointer approach
        System.out.println(maxWater(height));

    }
}
