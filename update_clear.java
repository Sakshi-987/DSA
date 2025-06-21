public class update_clear {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // first aproach
        // if(newBit == 0){
        // return clearIthBit(n,i);
        // }
        // else{
        // return setIthBit(n,i);
        // }

        // second approach
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    // function to clear last ith bit from n
    public static int clearLastIthBit(int n, int i) {
        int bitMask = (~0)<<i;
        // (~0) and (-1) is same which is 1111111...
        return n & bitMask;
    }

    public static void main(String args[]) {
    //for update
        System.out.println(updateIthBit(10, 2, 1));
        //for clearing last ith bit
        System.out.println(clearLastIthBit(15, 2));
    }
}
