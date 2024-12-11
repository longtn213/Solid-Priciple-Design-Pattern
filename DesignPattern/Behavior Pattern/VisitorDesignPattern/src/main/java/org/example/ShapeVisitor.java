package org.example;

public interface ShapeVisitor {
    public void visit (Circle circle);
    public void visit (Rectangle rectangle);
    public void visit (Triangle triangle);
}
