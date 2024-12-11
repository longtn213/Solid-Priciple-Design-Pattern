package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<ShoppingItem> items = new ArrayList<>();
//        items.add(new Table("desk", 20));
//        items.add(new Chair("chair1", 40));
//        items.add(new Chair("chair2", 50));
//        double sum =0;
//
//        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCart();
//        for (ShoppingItem shoppingItem:items){
//            sum += shoppingItem.accept(shoppingCartVisitor);
//        }
//        System.out.println(sum);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        ShapeVisitor save = new SaveCSVFile();
        for (Shape shape:shapes){
            shape.accept(save);
        }

    }
}