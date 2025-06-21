import java.util.*;

public class twoD_array {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("Key is not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int m = matrix.length, n = matrix[0].length;

        Scanner sc = new Scanner(System.in);
       
        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        // output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        //searching key 
        search(matrix, 8);
    }

}
