package factory;

public class ShapeFactory {
    public Shape makeShape(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
