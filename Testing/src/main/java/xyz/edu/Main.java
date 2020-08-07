package xyz.edu;
/*
 * @author Alexander Panyshchev
 * @since 8/7/20
 * @version 1.0
 *Task: Create and test Rectangle, RectangularBox and PalindromeService classes
 */
public class Main {
    public static void main(String[] args) {
        String abba = "abba";
        PalindromeService palindromeService = new PalindromeService(abba);
        System.out.println(palindromeService.isValid());
        System.out.println(PalindromeService.isValid(abba));

        RectangularBox rectangularBox = new RectangularBox(0, 2,3,4);
        System.out.println(rectangularBox.getTotalArea());
    }
}
