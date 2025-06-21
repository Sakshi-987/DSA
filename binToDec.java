import java.util.*;

public class binToDec {

    public static int bTd(int binN){
    int num = binN;
    int decN = 0;
    int pow = 0;
     while(binN>0){
     int lastDigit = binN % 10;
     decN = decN + lastDigit*((int)Math.pow(2, pow));
     pow++;
     binN = binN /10;

     }
     System.out.print("decimal of "+ num + " is :");
     return decN;
    }

    public static void main(String args[]) {
    //    binToDec_conversion(010);
     System.out.print(bTd(101));
    
    }
}
