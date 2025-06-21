public class abstract_class {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat1();
        h.walk();
        h.changecolor(); 
        // to change color
        System.out.println(h.colors);

        Chicken c = new Chicken();
        c.eat1();
        c.walk();
    }
}

abstract class petAnimal {
    String colors;
     petAnimal(){
        colors = "brown";
     }
    void eat1() {
        System.out.println("animal eats.");
    }

    abstract void walk();

}

class Horse extends petAnimal {
    void walk() {
        System.out.println("walks on 4 legs.");
    }
    void changecolor(){
        colors = "dark brown";
    }
}

class Chicken extends petAnimal {
    void walk() {
        System.out.println("walks on 2 legs.");
    }
    void changecolor(){
        colors = "yellow";
    }
}
