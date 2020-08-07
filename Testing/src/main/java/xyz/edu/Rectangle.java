package xyz.edu;

import java.util.logging.Logger;

/*
 * @author Alexander Panyshchev
 * @since 8/7/20
 * @version 1.0
 *Task: Create and test rectangle
 */

public class Rectangle {
    private double height, width;

    //------------Constructors---------------------
    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    //------------Constructors---------------------

    //------------Getters/Setters------------------
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
    //------------Getters/Setters------------------

    //@return perimeter of rectangle
    public double getPerimeter(){
        return 2 * (this.getHeight() + this.getWidth());
    }
}
