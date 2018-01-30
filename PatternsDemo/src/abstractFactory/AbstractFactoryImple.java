package abstractFactory;

import factory.Color;
import factory.ColorFactory;
import factory.Shape;
import factory.ShapeFactory;

/**
 *
 * @author ashok
 */
public class AbstractFactoryImple implements AbstractFactory {

    @Override
    public Color createColor(ColorFactory.Colors color) {
        return new ColorFactory().createColor(color);
    }

    @Override
    public Shape createShape(ShapeFactory.ShapeType shapeType) {
        return new ShapeFactory().createShape(shapeType);
    }

}
