public class max_subarray {
    public static void subarraySum(int numbers[]) {

        int currSum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];

                }
                System.out.println(currSum);
                if(max_sum<currSum){
                max_sum=currSum;
                }
            }
        }
        System.out.println("max sum = "+max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1,-2,6,-1,3 };
        subarraySum(numbers);

    }
}