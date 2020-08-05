package xyz.edu;

public class Main {
    public static void main(String[] args) {
        String abba = "abba";
        PalindromeService palindromeService = new PalindromeService(abba);
        System.out.println(palindromeService.isValid());
        System.out.println(PalindromeService.isValid(abba));

        RectangularBox rectangularBox = new RectangularBox(0, 2,3,4);
        System.out.println(rectangularBox.getArea());
    }
}
