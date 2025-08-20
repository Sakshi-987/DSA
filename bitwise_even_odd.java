public class bitwise_even_odd {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even
            System.out.println("even number ");
        } else {
            // odd
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(0);
        oddOrEven(3);
        oddOrEven(5);
        oddOrEven(11);
    }
}
