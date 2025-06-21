import java.util.*;

public class unionNintersection {
    public static void main(String args[]) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("No. of union elements = " + set.size());
        System.out.print("Elements :");
        for (int keys : set) {
            System.out.print(keys + " ");
        }

        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

         System.out.println();
        int count = 0;

        ArrayList<Integer>num = new ArrayList<>();
         System.out.print("Intersection Elements :");
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
                num.add(arr2[i]);
            }
        }
        System.out.println(num);
        System.out.println("intersection = " + count);
    }
}
