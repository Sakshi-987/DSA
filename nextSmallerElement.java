import java.util.*;

public class nextSmallerElement {

    public static List<Integer> nextSmaller(int heights[]) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        // ans array for storing next Smaller elements
        List<Integer> ans = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int curr = heights[i];
            while (s.peek() != -1 && heights[s.peek()] >= curr) {
                s.pop();
            }
            ans.add(s.peek());
            s.push(i);
        }

        Collections.reverse(ans);
        return ans;
    }


// prev smaller element
    public static List<Integer> prevSmaller(int heights[]) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        // ans array for storing next Smaller elements
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int curr = heights[i];
            while (s.peek() != -1 && heights[s.peek()] >= curr) {
                s.pop();
            }
            ans.add(s.peek());
            s.push(i);
        }
        return ans;
    }
    

    public static void main(String args[]) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(nextSmaller(heights));
        System.out.println(prevSmaller(heights));
    }
}
