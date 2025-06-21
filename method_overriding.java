public class method_overriding {
public static void main(String[] args) {
    
        Deer d = new Deer();
        d.eatss();
        // it override function written in animal class
    }
}

class Animalss {
    void eatss() {
        System.out.println("eats anything");
    }
}

class Deer extends Animalss {
    void eatss() {
        System.out.println("eats grass");
    }
}
