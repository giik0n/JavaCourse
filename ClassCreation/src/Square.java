/*
        * @author Alexander Panishchev
        *Task:
        * Inheritance
            1. Create a child  from the class Rectangle.
        * */
public class Square extends Rectangle{//child class of Rectangle
    int side;



    public Square(int side){
        super(side,side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return getClass().getName()+" {" +
                "side=" + side +
                '}';
    }
}
