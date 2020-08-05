package xyz.edu;

import java.util.logging.Logger;

public class Rectangle {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }

    public double getPerimeter(){
        return 2 * (this.getHeight() + this.getWidth());
    }
}
