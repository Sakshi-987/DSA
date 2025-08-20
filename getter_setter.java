

public class getter_setter {
    public static void main(String[] args) {
        myPen p1 = new myPen();
        
        // Set and get color
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        // Set and get tip
        p1.setTip(5);
        System.out.println(p1.getTip());

        // Change color and get it
        p1.setColor("Black");
        System.out.println(p1.getColor());
    }
}

class myPen {
    // Private properties
    private String color;
    private int tip;

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return this.color;
    }

    // Setter for tip
    public void setTip(int tip) {
        this.tip = tip;
    }

    // Getter for tip
    public int getTip() {
        return this.tip;
    }
}
