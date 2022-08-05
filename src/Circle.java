public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    //  Now overriding draw is mandatory
    @Override
    public void draw() {
        System.out.println("Circle is drawing with color: " + super.getColor());
    }
}
