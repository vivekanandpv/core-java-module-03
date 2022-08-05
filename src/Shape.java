public class Shape {

    //  private members are not visible to the subclasses
    private String color;

    //  The superclass object construction must precede
    //  the subclass object construction
    public Shape(String color) {
        this.color = color;
    }

    //  Java takes the "virtual by default" approach to instance methods
    //  Unless you specifically mark the method as final, the subclasses
    //  are allowed to provide the overrides

    //  So this draw method is allowed to be overridden in the subclasses
    public void draw() {
        System.out.println("Shape is drawing with color: " + getColor());
    }

    //  We don't see any point in allowing this getColor to be overrideable
    //  What could be the reason?
    public final String getColor() {
        return color;
    }
}
