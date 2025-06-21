public class inheritance_oops {
    public static void main(String args[]) {
    // single level inheritence
    Fish shark = new Fish();
    shark.eat();

    // multi level inheritence
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
    dobby.breed = "Indian";
    System.out.println(dobby.breed);

    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived Class or subclass
class Fish extends Animal {
    int fins;

    void swim(){
    System.out.println("swims in water");
    }
}

// multi level inheritence
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
