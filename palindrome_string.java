public class palindrome_string {
    public static void main(String args[]) {
        String str = "parrot";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
               //not palindrome
                return false;
            }
        }
        //if all char fails in if condition then its true.
        // if palindrome return true
        return true;
    }
}
