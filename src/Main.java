public class Main {
    public static void main(String[] args) {
        //  When Circle inherits the API of Shape,
        //  can it specialize the implementation?

        //  The answer is yes! The subclasses are allowed to
        //  (in fact, in most cases, appreciated/expected to)
        //  provide their special implementation

        //  Thus you have the superclass providing API, but subclasses
        //  providing implementations

        //  This brings in a very important feature of object-orientation
        //  called dynamic dispatch or runtime polymorphism

        Shape[] shapes = new Shape[] {
                new Circle("green"),
                new Triangle("red")
        };

        for (Shape s: shapes) {
            //  This is the dynamic dispatch
            //  Where should this call be resolved? As we know s can be a Shape, Circle, or Triangle
            //  Given this fact, the API is determined by the superclass but the execution happens at
            //  the subclass level (provided they have overrides available)
            s.draw();
        }
    }
}