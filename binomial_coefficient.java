import java.util.*;

public class binomial_coefficient {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }

    public static int bin_coeff(int n, int r) {
        // to calculate nCr = n!/(r!)(n-r)!
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_minus_r_fact = fact(n - r);
        int final_ans = (n_fact) / ((r_fact) * (n_minus_r_fact));
        return final_ans;
    }

    public static void main(String args[]) {
        System.out.println(bin_coeff(5,4));
    }
}
