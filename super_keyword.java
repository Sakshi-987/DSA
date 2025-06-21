public class super_keyword {
    public static void main(String args[]) {
        Horsee h = new Horsee();
        System.out.println(h.color);
    }
}

class Animall {
String color;
    Animall() {
        System.out.println("animal constructor is called.");
    }
}

class Horsee extends Animall {
    Horsee() {
    // super();
        super.color = "brown";
        System.out.println("horse costructor is called");
    }
}
