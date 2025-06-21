import java.util.*;

public class insert_in_heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);
            int x = arr.size() - 1; // xis child index
            int par = (x - 1) / 2; // par index

            while (x > 0 && arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        
        // to get min in heap
        public int peek() {
            return arr.get(0);
        }

        // heapify
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // to fix the remaining heap
                heapify(minIdx);
            }
        }

        // remove method
        public int remove() {
            int data = arr.get(0);

            // step-1 -> swap 1st index with last index
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step-2 -> delete last index
            arr.remove(arr.size() - 1);

            // step-3 -> heapify, to fix the heap
            heapify(0);
            return data;
        }

        // to check whether heap is empty or not
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
        Heap h = new Heap();

        // adding elements
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);

        
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

        
    }
}
