public class Circle extends Shape {
    //  It is always a good practice to bank on the
    //  constructor parameters that are passed by the client
    //  rather than providing defaults


    public Circle(String color) {
        //  As the construction of superclass precedes,
        //  it is essential to call the superclass constructor
        //  as the first statement

        //  Remember: this -> current object reference
        //  super -> superclass member reference
        super(color);
    }
}
