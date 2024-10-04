package org.example;

public class Wall {

    private double height;
    private double width;

    public Wall(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
        // Math.max(width, 0);
    }

    public double getArea() {
        return width * height;
    }
}
