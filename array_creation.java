import java.util.*;

public class array_creation {
    public static void main(String[] args) {
        int marks[]=new int[50];
        /* till we're not entering any input into this array ,it store 0 by default in every index '*/

        int numbers[]={1,2,3};


        int score[]=new int[100];
        Scanner sc =  new Scanner(System.in);
        System.out.println("phy score :" );
        score[0]= sc.nextInt();
        System.out.println("chem score :" );
        score[1]=sc.nextInt();
        System.out.println("math score :");
        score[2]=sc.nextInt();

        System.out.println("length of an array:"+numbers.length);


int percentage = (score[0]+score[1]+score[2])/3;
System.out.println("percentage :"+percentage+ "%" );



    }
}
