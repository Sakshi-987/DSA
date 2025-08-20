public class multiple_inheritance {
    public static void main(String args[]) {
     Bear b = new Bear();
     b.grassEater();
     b.fleshEater();
     
    }
}

interface Herbivores {
    void grassEater();
}

interface Carnivores {
    void fleshEater();

}

class Bear implements Herbivores, Carnivores {
    public void grassEater() {
        System.out.println("eats grass");
    }

    public void fleshEater() {
        System.out.println("also eats flesh.");

    }
    // System.out.println("eats both grass & flesh.");
}
