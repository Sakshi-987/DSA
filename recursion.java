public class recursion {
    public static void main(String args[]) {
        int n = 10;
        printDec(n);

        // to print increasing order
        System.out.println();
        printInc(n);

        // to print the sum of first n natural no.
        System.out.println();
        System.out.println(calcSum(n));

        // to print the fact of n
        System.out.println();
        System.out.println(factOfn(n));

        // to print fibonacci of nth no.
        System.out.println();
        System.out.println(fib(n));

    }

    // print from n to 1 in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    // printing from 1 to n in increasing order
    public static void printInc(int n) {
        // base case
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.println(n + " ");
    }

    // print sum of first n natural no.
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // to print fact of n numbers
    public static int factOfn(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factOfn(n - 1);
        int fn = n * fnm1;
        return fn;

    }

    // to print fibonacci of nth no.
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int Fnm1 = fib(n-1);
        int Fnm2 = fib(n-2);
        int Fn = Fnm1 + Fnm2;
        return Fn;
    }
}
