public class inverted_halfPyr_numbers {

    public static void halfPyrNum(int n) {
        for (int i = 1; i <= n; i++) {
            //inner numbers
            for(int j=1;j<=(n-i+1); j++){
            System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
    halfPyrNum(5);

    }
}
