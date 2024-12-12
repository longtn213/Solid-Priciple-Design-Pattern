package org.example;

public class Main {
    public static void main(String[] args) {
//        OperationManager manager = new OperationManager();
//        manager.setStrategy(new Division());
//        manager.execute(10,5);

        ImageManager imageManager = new ImageManager();
        imageManager.setRenderer(new LaptopRenderer());
        imageManager.show();
    }
}