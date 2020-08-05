package xyz.edu;

public class Main {
    public static void main(String[] args) {
        String abba = "ABba";//true
        PalindromeService palindromeService = new PalindromeService(abba);
        System.out.println(palindromeService.isValid());
        PalindromeService.isValid(abba);
    }
}
