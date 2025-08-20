public class Kadanes_foralltestcase {

    public static int allInOne(int arr[]) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String args[]) {
        int arr[] = {-1,-1,-5,-5,-6 };
        System.out.println("max sum in all subarrays is : "+allInOne(arr));

    }
}
