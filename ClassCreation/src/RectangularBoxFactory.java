public class RectangularBoxFactory {
    public static RectangularBox create(int length, int width, int height){

        /*
        * @author Alexander Panishchev
        * @since 10-06-2020
        * @version 1.4
        *Task:
        * Develop for your class
            1. Factory.
            *
           @param length means Figure Length
           @param width means Figure Width
           @param height means Figure Height
        * */

        if (height>0) {
            return new RectangularBox(length,width,height);
        }else {
            return null;
        }
    }
}
