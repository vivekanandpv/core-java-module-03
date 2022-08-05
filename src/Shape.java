public class Shape {

    //  private members are not visible to the subclasses
    private String color;

    //  The superclass object construction must precede
    //  the subclass object construction
    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Shape is drawing with color: " + getColor());
    }

    public String getColor() {
        return color;
    }
}
