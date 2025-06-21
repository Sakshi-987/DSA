import java.util.*;

public class palindrome {
    public static boolean palindrome_Num(int num) {
    int myNum = num;
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;

        }

        if (myNum == rev) {
            System.out.print(myNum + " is palindrome ");
            return true;
        } 
            System.out.println(myNum + " is not palindrome.");
            
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        palindrome_Num(121000);
    }
}
