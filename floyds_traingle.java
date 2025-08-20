public class floyds_traingle {

    public static void floyds(int n) {
        // outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            // inner loop
            for(int j=1;j<=i;j++){
            System.out.print(counter + " ");
            counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floyds(5);
    }
}
