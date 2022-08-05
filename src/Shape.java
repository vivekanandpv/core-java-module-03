


public interface Shape {
    //  interface cannot have fields and constructors

    //  All methods in an interface are abstract unless marked as default, static, or private

    //  public is presumed from interface's accessibility
    //  abstract is presumed implicitly

    //  The subclasses (implementers of this interface) must provide the override for this
    void draw();

    //  Starting with Java 8, interfaces can have default methods
    //  which must have an implementation (default implementation)

    //  Overriding the default methods is optional
    default String getColor() {
        return provideColor();  //  accessing the private method
    }

    //  Starting with Java 8, the interfaces can now have
    //  static methods, which can only be accessed on the interface type
    //  Shape.foo();
    static void foo() {
        //  This runs in the static context, hence instance context (other members) is not accessible
        //  For example, provideColor() or getColor() are defined in the instance context
        //  (accessible through an instance alone)
        System.out.println("A static method");
    }

    //  Starting with Java 11, interfaces can have private methods
    //  This is to modularize the code in larger interfaces
    //  private methods can only be accessed within the interface
    //  by default methods
    private String provideColor() {
        return "no color";
    }
}
