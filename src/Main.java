public class Main {
    public static void main(String[] args) {
        //  Now that the Circle and Triangle are the subclasses of Shape
        //  the objects of Circle and Triangle can be substituted for Shape
        //  Please note this general idea:
        //  a subclass object can be substituted for a superclass

        Shape shapeCircle = new Circle();
        Shape shapeTriangle = new Triangle();

        //  Since Shape itself inherits from Object (implicitly)
        Object circleObject = new Circle();
        Object triangleObject = new Triangle();

        //  Thus an object (such as a circle) has multiple identities
        //  (as a Circle, as a Shape, as an Object)
        //  This is the polymorphism (many faces)
    }
}