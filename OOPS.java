public class OOPS {
    public static void main(String[] args) {
    // creating actual objects of pen
    // created a pen objects called p1
    // new is a keyword used to create memory in heap.
    Pen p1 = new Pen();
    // Pen() is called a constructor

    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);

    // created a student object
        Student s1 = new Student();
        s1.name = "Sakshi";
        System.out.println(s1.name);
        
        s1.calcPercentage(85,89,95);
        System.out.println(s1.percentage);
    }
}

class Pen {
    // properties
    String color;
    int tip;

    // functions
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    
}

// another class

class Student {
    String name;
    int age;
    float percentage; // cgpa

    // functions
    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
