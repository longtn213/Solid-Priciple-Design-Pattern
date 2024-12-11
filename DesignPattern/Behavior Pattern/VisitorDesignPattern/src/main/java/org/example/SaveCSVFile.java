package org.example;

public class SaveCSVFile implements ShapeVisitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("Save circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Save rectangle");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Save triangle");
    }
}
