package factory;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.makeShape("CIRCLE");
        s1.draw();

        Shape s2 = shapeFactory.makeShape("SQUARE");
        s2.draw();

        Shape s3 = shapeFactory.makeShape("RECTANGLE");
        s3.draw();
    }
}
