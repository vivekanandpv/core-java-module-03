public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    //  @Override is an annotation
    //  Strictly speaking, this is optional. But it is recommended.
    //  Acts as a safety net for silly errors
    @Override
    public void draw() {
        //  Subclass provides its special implementation
        //  The superclass implementation can be accessed by
        //  super.draw();

        //  Since there is no ambiguity, super.getColor() and getColor() are same
        System.out.println("Circle is drawing with color: " + super.getColor());
    }
}
