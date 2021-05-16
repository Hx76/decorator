package test;

import decorator.RedShapDecorator;
import shap.impl.Circle;
import shap.impl.Rectangle;

public class DecoratorTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapDecorator redShapDecorator = new RedShapDecorator(circle);
        RedShapDecorator redShapDecorator1 = new RedShapDecorator(new Rectangle());
        circle.draw();
        redShapDecorator.draw();
        redShapDecorator1.draw();
    }
}
