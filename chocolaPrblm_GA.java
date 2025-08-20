import java.util.*;

public class chocolaPrblm_GA {
    public static void main(String args[]) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // pointers
        int hp = 1, vp = 1; // pieces
        int cost = 0;

        // tracking pointer h & v along with finding cuts , vertical & horizontal pieces
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { // vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        // if any horizontal cut left i.e elements left in array
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        // if any vertical cut left i.e elements left in array
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = "+cost);

    }
}
