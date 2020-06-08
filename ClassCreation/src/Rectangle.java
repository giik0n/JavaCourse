import Interfaces.IGeometry;
import Interfaces.IPackaging;

import java.util.Objects;

 /*
        * @author Alexander Panishchev
        *Task:
        * Inheritance
        1. Create a child  from the class Rectangle.
        2. Create another class as a super class for your one.  Or create a daughterly class for your one.
        * */

public class Rectangle implements IPackaging, IGeometry {
    private int id;
    private int length;
    private int width;

    public Rectangle(int id, int length, int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    //------------Getters-Setters------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return getClass().getName()+" {" +
                "id=" + id +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    //--------------Overrides-----------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return id == rectangle.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getLinearLength() {
        return 2 * (this.getWidth() * this.getLength());
    }

    @Override
    public String toJSON() {
        return getClass().getName()+" {"
                + "\""  + "length\":" + this.getLength()
                + ","
                + "\""  + "width\":" + this.getWidth()
                + "}";
    }

    @Override
    public String toXML() {
        return "<"+getClass().getName()+">"
                + "<length>" + this.getLength() + "</length>"
                + "<width>" + this.getWidth() + "</width>"
                +  "</"+getClass().getName()+">";
    }

    @Override
    public void toConsole() {
        System.out.println("----------------------"
                + "\n Shape: " + getClass().getName()
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n----------------------");

    }
}
