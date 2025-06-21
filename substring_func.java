public class substring_func {
    public static void main(String args[]) {
        String str = "HelloWorld";
        //.substring(si,ei) is inbuilt function to use it directly
        // System.out.println(str.substring(5, 10));
               System.out.println( subString(str, 0, 6));
    }

    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            // we can add strings like numbers
            substr = substr + str.charAt(i);
        }
        return substr;
    }
}
