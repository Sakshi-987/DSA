import java.util.*;

public class String_basics {

    public static void printLetters(String fin) {
        for (int i = 0; i < fin.length(); i++) {
            System.out.println(fin.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String str = "abcd";// 1st method of declaring string
        String str1 = "xyz&3#12";// 2nd method of declaring strings

        // input string
        Scanner sc = new Scanner(System.in);
        // String name= sc.next();//to input only single word
        // System.out.print(name);
        // to input whole sentence.
        // String sentence = sc.nextLine();
        // System.out.println(sentence);

        String fullName = "Sakshi sahu";
        System.out.println(fullName.length());

        String st = "my";
        String nd = "name";
        String fin = st + " " + nd;
        System.out.println(fin);
        // System.out.println();
        printLetters(fin);
    }

}