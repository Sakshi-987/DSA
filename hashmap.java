import java.util.*;

public class hashmap {
    public static void main(String args[]) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        // ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove - O(1)
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());
        // isEmpty
        System.out.println(hm.isEmpty());
        // clear
        hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

        // interation on hashmap
        hm.put("parvati", 10);
        hm.put("pari", 9);
        hm.put("ambika", 10);
        hm.put("prathavi", 8);

        // iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Keys =" + k + ",value=" + hm.get(k));
        }
    }
}
