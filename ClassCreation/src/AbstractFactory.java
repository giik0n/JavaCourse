import Interfaces.IGeometry;

    /*
        * @author Alexander Panishchev
        * @since 10-06-2020
        * @version 1.4
        *Task:
        * Develop for your class
            2. Abstract factory.
            *
           @param length means Figure Length
           @param width means Figure Width
           @param height means Figure Height
    */

public class AbstractFactory {
    public static IGeometry create(int length, int width, int height){
        if (height > 0){
            return new RectangularBox(length, width,height);
        }else if (height ==0){
            return new FlatRectangularBox(length,width);
        }else {
            return null;
        }
    }
}
