package org.example;

public class Triangle implements Shape{

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
