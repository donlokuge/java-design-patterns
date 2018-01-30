package abstractFactory;

import factory.Color;
import factory.ColorFactory;
import factory.Shape;
import factory.ShapeFactory;

/**
 *
 * @author ashok
 */
public interface AbstractFactory {

    abstract Color createColor(ColorFactory.Colors color);

    abstract Shape createShape(ShapeFactory.ShapeType shapeType);
}
