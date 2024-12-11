package org.example.demo;

public interface ShoppingItem {
    public double accept(ShoppingCartVisitor visitor);
}
