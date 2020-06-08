import Interfaces.IGeometry;
import Interfaces.IPackaging;

import java.util.Objects;
    /*
        * @author Alexander Panishchev
        *Task:
        * Create a class from the attached document according to the order in your group .  The class must contain
            1. Constructor.
            2. Getters/Setters.
            3. 5 methods.
            4. Override toString() method
            5. Override hash() and equals() methods.
        * */

public class RectangularBox implements IGeometry, IPackaging {
    private int id, length, width, height;

    public RectangularBox(int id, int length, int width, int height) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public RectangularBox() {
    }

    public RectangularBox(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getTotalArea(){
        return (this.height * this.width)*2
                + (this.height * this.length)*2
                + (this.length * this.width)*2;
    }

    public int getBasementArea(){
        return this.length * this.width;
    }

    public int getCapacity(){
        return this.height * this.width * this.length;
    }

    public  double getDiagonalLength(){
        return Math.sqrt(Math.pow((double)this.height,2) + Math.pow((double)this.length,2) + Math.pow((double)this.width,2));
    }
    public  double getBasementDiagonalLength(){
        return Math.sqrt(Math.pow((double)this.length,2) + Math.pow((double)this.width,2));
    }

    //------------Getters-Setters------------------
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

    @Override
    public String toString() {
        return getClass().getName()+" {" +
                "id=" + id +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public String toJSON() {
        return getClass().getName()+" {"
                + "\""  + "length\":" + this.getLength()
                + ","
                + "\""  + "width\":" + this.getWidth()
                + ","
                + "\""  + "height\":" + this.getHeight()
                + "}";
    }

    @Override
    public String toXML() {
        return "<"+getClass().getName()+">"
                + "<length>" + this.getLength() + "</length>"
                + "<width>" + this.getWidth() + "</width>"
                + "<height>" + this.getWidth() + "</height>"
                +  "</"+getClass().getName()+">";
    }

    @Override
    public void toConsole() {
        System.out.println("----------------------"
                + "\n Shape: " + getClass().getName()
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n Height: " + this.height
                + "\n----------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularBox that = (RectangularBox) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public double getArea() {
        return getTotalArea();
    }

    @Override
    public double getLinearLength() {
        return getLength();
    }
}
