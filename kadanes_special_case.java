public class kadanes_special_case {

    public static void specialCase(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                cs = 0;
                ms = Math.max(ms, numbers[i]);
            }
        }
        System.out.println("max subarray sum is : "+ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -1, -2, -3, -4 };
        specialCase(numbers);

    }
}
