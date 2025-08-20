import java.util.*;

public class LLbyJCF {

    public static void main(String args[]) {
        LinkedList<Integer> newll = new LinkedList<>();
        // add
        newll.addLast(1);
        newll.addLast(2);
        newll.addFirst(0);
        System.out.println(newll);
        newll.removeLast();
        newll.removeFirst();
        System.out.println(newll);
    }

}
