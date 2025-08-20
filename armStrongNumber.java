public class armStrongNumber {
    // You are given an integer n. You need to check whether it is an armstrong
    // number or not. Return true if it is an armstrong number, otherwise return
    // false.

    // An armstrong number is a number which is equal to the sum of the digits of
    // the number, raised to the power of the number of digits.

    public static boolean isArmStrong(int n) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp = n;
        int ans = 0;
        while (temp > 0) {
            int num = temp % 10;
            int product = 1;
            for (int i = 0; i < count; i++) {
                product = product * num;
            }
            ans += product;
            temp /= 10;
        }
        System.out.println(ans);

        return (n==ans);
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println("Is "+n+" Armstrong number :"+isArmStrong(n));
    }
}
