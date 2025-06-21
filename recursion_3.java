public class recursion_3 {
    public static void main(String args[]) {
        System.out.println(tilingProblem(4));

        System.out.println();

        // remove duplicates in a string
        String str = "appnnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);

        System.out.println();
        // friendsPairing problem
        System.out.println(friendsPairing(3));

        System.out.println();
        // creating binary strings
        printBinStrings(3, 0, "");

    }

    // tiling problem
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        // int fnm1 = tilingProblem(n - 1);
        // // horizontal choice
        // int fnm2 = tilingProblem(n - 2);

        // // total choice = vertical choice + horizontal choice
        // int total = fnm1 + fnm2;
        // return total;

        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    // remove duplicates from a string
    public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeduplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeduplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    // friendsPairing problem
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    // create binary strings
    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        printBinStrings(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }
}
