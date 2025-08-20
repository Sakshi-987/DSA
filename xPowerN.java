public class xPowerN {

    // O(n) T.C
    public static double myPow(double x, int n) {
        if (x == 0)
            return 0.0;
        if (n == 0)
            return 1.0;
        if (x == 1)
            return 1.0;
        if (x == -1 && n % 2 == 0)
            return 1.0;
        if (x == -1 && n % 2 != 0)
            return -1.0;
        long binForm = n;
        if (n < 0) {
            x = 1 / x;
            binForm = -binForm;
        }
        double ans = 1;

        while (binForm > 0) {
            if (binForm % 2 == 1) {
                ans *= x;
            }
            x = x * x;
            binForm /= 2;
        }
        return ans;

    }

    // by bit-manipulation menthod
    public static double secondWay(double x, int n) {
        // corner cases
        double ans = 1.0;
        if(x==1.0)return 1.0;
        if (n == 0 )
            return 1.0;
        if (x == 0)
            return 0.0;
        if (x == (-1) && (n % 2) == 0)
            return 1.0;
        if (x == (-1) && (n % 2) != 0)
            return -1.0;

        long binForm = n;
        if(binForm<0){
        x = 1/x;
        binForm = -binForm;
        }
        while (binForm > 0) {
            if ((binForm & 1) != 0)
                ans = ans * x;
            x *= x;
            binForm = binForm >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        double x = 2.00000;
        int n = -2;

        System.out.println(myPow(x, n));
        System.out.println(secondWay(x, n));
    }
}
