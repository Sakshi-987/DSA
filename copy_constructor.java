public class copy_constructor {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Sakshi";
        s1.roll = 67;
        s1.passWord = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student1 s2 = new Student1(s1); // copy
        // to copy all properties of s1 into s2.
        s2.passWord = "xyz";

        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student1 {
    String name;
    int roll;
    String passWord;
    int marks[];

    // shallow copy constructor
    // Student(Student s1) {
    //     // passing s1 in constructor itself.
    //     // copying the properties of s1
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student1(Student1 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student1() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student1(String name) {
        // to make constructor ensure that there are only 3 subjects marks
        marks = new int[3];
        this.name = name;
    }

    Student1(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}
