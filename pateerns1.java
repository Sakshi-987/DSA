import java.util.*;

public class pateerns1 {

    public static void star_pattern(int n) {
        // *
        // **
        // ***
        // **** have to print this pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // print half-pyramid pattern
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void half_pyramid(int n) {
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // inverted pattern next
    // ****
    // ***
    // **
    // *
    public static void inverted_pattern(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // character pattern
    // A
    // B C
    // D E F
    // G H I J

    public static void char_pattern(int n) {
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        star_pattern(4);
        inverted_pattern(5);
        half_pyramid(10);
        char_pattern(4);
    }
}
