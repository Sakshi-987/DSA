public class static_keyword {
    public static void main(String args[]){
    StudentData s1 = new StudentData();
    s1.schoolName = "Jai Academy";
    System.out.println(s1.schoolName);

    
    StudentData s2 = new StudentData();
    s2.schoolName = "JMV";
    System.out.println(s2.schoolName);
    System.out.println(s1.schoolName);
    }
}

class StudentData {
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;

    }

    String getName(){
        return this.name;
    }
}
