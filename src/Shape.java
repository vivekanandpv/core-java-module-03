//  We reckon the Shape is a useful generalization only for the API
//  and not for any implementation
//  But then, we would like to enforce the subclasses (Circle and Triangle)
//  to provide implementation for the API

//  Thus, we make the Shape an "abstract" class

//  Like a regular class, we can have fields, constructors, and methods here
//  But since it is an abstract class, it cannot be instantiated
//  (new Shape() is not allowed)

//  Additionally, if we make a method abstract, it cannot have body
//  And such a method must be overridden in the subclasses

//  Generally, the abstract classes are used to set up basic infrastructure for a host
//  of subclasses

public abstract class Shape {

    //  if we make the fields (or class variables) final,
    //  they must either be initialized in place or in constructors
    private final String color;

    //  We generally choose to initialize the final fields in the constructor
    public Shape(String color) {
        this.color = color;
    }

    //  We make the draw an abstract method
    //  Abstract members can only be defined in the abstract classes
    public abstract void draw();

    //  Abstract classes can have normal members (including final members)
    public final String getColor() {
        return color;
    }
}
