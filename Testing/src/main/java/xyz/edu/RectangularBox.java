package xyz.edu;

import java.util.Objects;

/*
 * @author Alexander Panyshchev
 * @since 8/7/20
 * @version 1.0
 *Task: Create and test RectanglularBox
 */

public class RectangularBox{
    private int id, length, width, height;


    //------------Constructors---------------------
    public RectangularBox() {
    }

    public RectangularBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public RectangularBox(int id, int length, int width, int height) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //------------Constructors---------------------

    //@return total area of all surfaces
    public int getTotalArea(){
        return (this.height * this.width)*2
                + (this.height * this.length)*2
                + (this.length * this.width)*2;
    }
    //@return total area of base surfaces
    public int getBasementArea(){
        return this.length * this.width;
    }
    //@return capacity of RectangularBox
    public int getCapacity(){
        return this.height * this.width * this.length;
    }

    //@return diagonal length of RectangularBox
    public  double getDiagonalLength(){
        return Math.sqrt(
                Math.pow(this.height,2)
              + Math.pow(this.length,2)
              + Math.pow(this.width,2));
    }

    //@return diagonal length of RectangularBox basement
    public  double getBasementDiagonalLength(){
        return Math.sqrt(Math.pow(this.length,2) + Math.pow(this.width,2));
    }

    //------------Getters/Setters------------------
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}