public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
     return (n &(n-1)) ==0;
     //if (n &(n-1)) equals 0 , it returns  true otherwise false.
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(16));
    }
}
