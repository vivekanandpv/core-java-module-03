//  Interfaces must be implemented in classes as opposed to be extended
//  But interfaces extend one another

//  Java supports implementation of multiple interfaces (comma-separated)
public class Circle implements Shape {

    //  When using interfaces, the burden of the infrastructure shifts to
    //  the implementing class
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    //  Now overriding draw is mandatory
    @Override
    public void draw() {
        System.out.println("Circle is drawing with color: " + getColor());
    }

    //  Overriding the default members is optional
    @Override
    public String getColor() {
        return color;   //  For default in interface: Shape.super.getColor();
    }
}
