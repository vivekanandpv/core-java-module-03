public class Main {
    public static void main(String[] args) {
        //  When the requirement is only to enforce the API
        //  and no infrastructure provision is required,
        //  it is better to use interfaces.

        //  Like abstract classes, interfaces cannot be instantiated

        Shape[] shapes = new Shape[]{
                new Circle("green"),
                new Triangle()
        };

        for (Shape s : shapes) {
            s.draw();   //  this API contract is now enforced
        }
    }
}