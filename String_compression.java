public class String_compression {
    public static void main(String args[]) {
         String str = "aaabbcccddeeeee";
        // String str = "abbbcc";
         System.out.println(compress(str));
        //  StringBuilder function 
        // System.out.println(compressed_String(str));     


    }

    public static String compress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            // creating a count object as we want to convert it into string later
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            // printing the char first
            newStr += str.charAt(i);
            if (count > 1) {
                // count.toString() convert object count to string then add this in newStr
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static String compressed_String(String str) {
    //By stringBuilder 
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
            sb.append(count.toString());
            }
        }
        return sb.toString();
    }
}
