public class constructor {
    public static void main(String args[]){
    myStudent s1 = new myStudent();
    myStudent s2 = new myStudent("Sakshi");
    System.out.println(s2.name);
    myStudent s3 = new myStudent(123);
    System.out.println(s3.roll);
    
    }
}

class myStudent{
    String name;
    int roll;

    // non-parameterized constructor
    myStudent(){
    System.out.println("constructor is called ...");
    }

    // parameterized constructor
     myStudent(String name){
    this.name = name;
    }

    myStudent(int roll){
    this.roll = roll;
    }
}
