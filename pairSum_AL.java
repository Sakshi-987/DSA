import java.util.*;

public class pairSum_AL {

    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum1NewWay(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            // case 3
            if (list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list2, int tar) {
        // sorted & rotated array
        int bp = -1;
        int n = list2.size() - 1;
        for (int i = 0; i < n; i++) {
            if (list2.get(i) < list2.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = lp;
        while (lp != rp) {
            // case1
            if (list2.get(lp) + list2.get(rp) == tar) {
                return true;
            }
            // case2
            if (list2.get(lp) + list2.get(rp) < tar) {
                lp = (lp + 1) % n;

            } else {
                // case 3

                rp = (n + rp - 1) % n;

            }

        }
        return false;

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target));

        // optimized way
        System.out.println(pairSum1NewWay(list, target));

        // new pairsum2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        int tar = 6;
        System.out.println(pairSum2(list2, tar));
        // System.out.println(pairSum1(list, target));

    }
}
