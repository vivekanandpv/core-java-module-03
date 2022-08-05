public class Triangle extends Shape {
    //  For explanation, please refer to Circle.java
    public Triangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Triangle is drawing with color: " + super.getColor());
    }
}
