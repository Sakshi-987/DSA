import java.util.*;

public class access_modifier {

    public static void main(String args[]) {
        bankAccount myAcc = new bankAccount();
        myAcc.username = "Sakshi Sahu";
        // myAcc.password = "1234";
        // password can't be accessed outside its class as its private

       System.out.println(myAcc.username);
        


    }
}

class bankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;


    }
}

