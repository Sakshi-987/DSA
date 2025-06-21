import java.util.*;

public class priorityQueue {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student>pq = new PriorityQueue<>();
        // pq.add(10);
        // pq.add(20);
        // pq.add(15);
        // pq.add(5);
        // pq.add(30);

        // while (!pq.isEmpty()) {
        // System.out.print(pq.peek() + " ");
        // pq.remove();
        // }

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}