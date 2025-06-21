public class recursion_2 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // // int arr[] = {1,2,8,5,5};
        // // int arr[] = {7,9,3,4,5};
        // int arr[] = {5};

        System.out.println(isSorted(arr, 0));
        System.out.println();

        // for first occurence of element
        int arr1[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurence(arr1, 5, 0));

        System.out.println();

        // print last occurence of element
        System.out.println(lastOccurence(arr1, 5, 0));

        System.out.println();
        // to print x^n
        System.out.println(power(2, 10));

        System.out.println();
        // to print x^n by optimized way
        System.out.println(powerOptimized(2, 10));
    }


    // to check whether the array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }


    // to check the first occurence of element
    public static int firstOccurence(int arr1[], int key, int i) {
        if (i == arr1.length) {
            return -1;
        }
        if (arr1[i] == key) {
            return i;
        }
        return firstOccurence(arr1, key, i + 1);
    }


    // print last occurence of element
    public static int lastOccurence(int arr1[], int key, int i) {

        if (i == arr1.length) {
            return -1;
        }

        int isFound = lastOccurence(arr1, key, i + 1);
        if (isFound == -1 && arr1[i] == key) {
            return i;
        }

        return isFound;
    }



    // to print x^n.
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }



    // to print x^n by optimized way
    public static int powerOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = powerOptimized(x, n/2);
        int halfPowerSq = halfPower * halfPower ;
        // if n is odd 
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

}
