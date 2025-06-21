import java.util.*;

public class decToBin {

    public static int dTb(int decN) {
        int num = decN;
        int binN = 0;
        int pow = 0;
        while (decN > 0) {
            int rem = decN%2;
            binN = binN + rem*((int)Math.pow(10,pow));
            pow++;
            decN = decN/2;
        }
        System.out.print("binary of "+ num +" is :");

        return binN;
    }

    public static void main(String args[]) {
    System.out.print(dTb(4));

    }
}
