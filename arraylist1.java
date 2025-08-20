import java.util.ArrayList;

public class arraylist1 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get elements
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }

        // remove elements

        list.remove(2);
        System.out.println(list);

        // set elements at index
        list.set(1, 5);
        System.out.println(list);

        // contains element
        // whether element is present or not
        System.out.println(list.contains(5));
        System.out.println(list.contains(12));

        // to add elements at particula index
        list.add(1, 9);
        System.out.println(list);

        // to get size,we use size method i.e. .size();
        System.out.println(list.size());

        // to print reverse of array
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
