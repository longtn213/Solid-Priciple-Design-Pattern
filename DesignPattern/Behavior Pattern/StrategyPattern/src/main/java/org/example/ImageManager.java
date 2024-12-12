package org.example;

public class ImageManager {
    private Renderer renderer;

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void show(){
        this.renderer.showImage();
    };
}
