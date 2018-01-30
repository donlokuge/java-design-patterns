/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author ashok
 */
public class ShapeTest {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Circle circle = (Circle) factory.createShape(ShapeFactory.ShapeType.CIRCLE);
        Rectangle rectangle = (Rectangle) factory.createShape(ShapeFactory.ShapeType.RECTANGLE);
        Triangle triangle = (Triangle) factory.createShape(ShapeFactory.ShapeType.TRIANGLE);
        
        
        circle.describe();
        rectangle.describe();
        triangle.describe();
    }
}
