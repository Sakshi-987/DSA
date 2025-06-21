import java.util.*;

public class Hashsets {
    public static void main(String args[]) {
        // hashSet
        HashSet<Integer>hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);
        if (hs.contains(2)) {
            System.out.println("contains 2");
        }
        System.out.println("size " + hs.size());
        hs.remove(2);
        if (hs.contains(2)) {
            System.out.println("contains 2");
        } else {
            System.out.println("not contains 2");
        }

        System.out.println("size " + hs.size());
        hs.clear();
        System.out.println("size " + hs.size());

        // linked hashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Bengaluru");
        lhs.add("delhi");
        lhs.add("Mumbai");

        // print in insertion order only
        System.out.println(lhs);

        TreeSet<String>ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Bengaluru");
        ts.add("Channai");
        ts.add("Goa");
        ts.add("Mumbai");

        // print in sorted order only
        System.out.println(ts);

        // working on iteration on hasSet
        HashSet<String>cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);
        Iterator it = cities.iterator();
        while(it.hasNext()){
        System.out.print(it.next() + " ");
        }

    }

}
