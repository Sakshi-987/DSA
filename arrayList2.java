import java.util.*;

public class arrayList2 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        // finding max of all elements
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element is :" + max);// T.C = O(n)

        // swapping
        int idx1=1,idx2=3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);

        Collections.sort(list);//ascending order
        System.out.print(list);

        System.out.println();
        
        // descending order sorting
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
