public class Triangle implements Shape {
    //  For explanation, please refer to Circle.java
    @Override
    public void draw() {
        System.out.println("Triangle is drawing with color: " + Shape.super.getColor());
    }
}
