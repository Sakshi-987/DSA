public class String_Builder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
         System.out.println(sb.length());
    }
}
