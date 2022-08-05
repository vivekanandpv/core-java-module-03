public class Main {
    public static void main(String[] args) {
        //  publicly available members of a type (class, interface, enum, annotation, record)
        //  together are called the API

        //  Subclasses inherit the API of the superclasses (superclass may extend
        //  another superclass so upward the hierarchy)
        Shape[] shapes = new Shape[] {
                new Circle("green"),
                new Triangle("red")
        };

        for (Shape s: shapes) {
            s.draw();   //  API of Shape is assured be accessible by all its subclasses
        }
    }
}