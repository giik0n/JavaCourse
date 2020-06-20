    /*
       * @author Alexander Panishchev
       * @since 10-06-2020
       * @version 1.4
       *Task:
       * Develop for your class
           1. Factory.
       * */

public class RectangularBoxFactory {
    /*
    * This method creates new RectangularBox object or returns null
    * @param length means Figure Length
    * @param width means Figure Width
    * @param height means Figure Height
    * @return the RectangularBox object or null
    */
    public static RectangularBox create(int length, int width, int height){
        if (height>0) {
            return new RectangularBox(length,width,height);
        }else {
            return null;
        }
    }
}
