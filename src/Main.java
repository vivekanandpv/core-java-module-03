public class Main {
    public static void main(String[] args) {
        //  In the polymorphic scenarios, it doesn't actually make sense
        //  to instantiate the generalized version of the superclass
        //  as it will be too general (and doesn't serve any useful purpose)

        //  So, we use the superclass to enforce the implementation of the API
        //  in the subclasses. Please note that in normal class inheritance,
        //  overriding is optional.

        //  Abstract classes cannot be instantiated directly
        //  new Shape("blue") -> This is not possible now

        //  Abstract classes can only appear in the type side of the variable, not in the value side

        Shape[] shapes = new Shape[] {
                new Circle("green"),
                new Triangle("red")
                //  new Shape("blue")   //  This is not possible now
        };

        for (Shape s: shapes) {
            s.draw();
        }
    }
}