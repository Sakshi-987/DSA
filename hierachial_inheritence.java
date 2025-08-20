public class hierachial_inheritence {
    public static void main(String args[]) {
    Cat xyz = new Cat();
    xyz.walk();
    xyz.eat();
    xyz.color = "golden-brown";
    System.out.println(xyz.color);

    Bird abc = new Bird();
    abc.fly();

    Fish1 pqr = new Fish1();
    pqr.swim();
    }
}

// base class
class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }
     void breathe(){
     System.out.println("breathe");
     }

}

class Cat extends Animals{
    void walk(){
    System.out.println("walks");
    }
} 

class Bird extends Animals{
    void fly(){
    System.out.println("flys");
    }
}

class Fish1 extends Animals{
    void swim(){
    System.out.println("swims");
    }
}
