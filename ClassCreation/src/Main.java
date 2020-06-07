public class Main {
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

    public static void main(String[] args) {
        RectangularBox rectangularBox = new RectangularBox(0,10,25,20);
        System.out.println(rectangularBox.getBasenamtDiagonalLength());
    }
}
