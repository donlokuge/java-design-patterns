 
package factory;

/**
 *
 * @author ashok
 */
public class ShapeFactory {

    public enum ShapeType {
        CIRCLE, RECTANGLE, TRIANGLE
    }

    public Shape createShape(ShapeType shapeType) {
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        }
        if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        }
        if (shapeType == ShapeType.TRIANGLE) {
            return new Triangle();
        }
        return null;
    }
}
