import java.util.*;

public class largestRectangleInHistogram {

    public static ArrayList<Integer> nextSmaller(int heights[], int n) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        ArrayList<Integer> ans = new ArrayList<>();
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

    // prev Smaller elements
    public static ArrayList<Integer> prevSmaller(int heights[], int n) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        ArrayList<Integer> ans = new ArrayList<>();
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

    public static int maxAreaRectangle(int heights[], int n) {
        ArrayList<Integer> nextS = new ArrayList<>();
        nextS = nextSmaller(heights, n);

        List<Integer> prevS = new ArrayList<>();
        prevS = prevSmaller(heights, n);

        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int length = heights[i];
            if (nextS.get(i) == -1) {
                nextS.set(i,n);
            }
            int breadth = nextS.get(i) - prevS.get(i) - 1;
            int area = length * breadth;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String args[]) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        int n = heights.length;
        System.out.println(nextSmaller(heights, n));
        System.out.println(prevSmaller(heights, n));
        System.out.println(maxAreaRectangle(heights, n));
    }
}
