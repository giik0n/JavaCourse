package xyz.edu;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PalindromeServiceTest {
    String palindromeString = "alula";
    String notPalindromeString = "alulu";
    String notPalindromeStringReversed = new StringBuilder("alulu").reverse().toString();
    PalindromeService palindromeService = new PalindromeService(palindromeString);
    PalindromeService palindromeService2 = new PalindromeService(notPalindromeString);
    Logger LOGGER =  Logger.getLogger(PalindromeServiceTest.class.getName());
    @Test
    public void whenPalindromeStringThenIsValidTrue() {
        LOGGER.info("String alula palindrome test");
        Assert.assertEquals(true,palindromeService.isValid());
    }

    @Test
    public void whenSimpleStringThenIsValidFalse() {
        LOGGER.info("String alulu palindrome test");
        Assert.assertEquals(false,palindromeService2.isValid());
    }


    @Test
    public void whenPalindromeThenSimilar() {
        LOGGER.info("String alula reverse test");
        Assert.assertEquals(palindromeString,palindromeService.getReversed());
    }
    @Test
    public void whenNotPalindromeThenReversedString() {
        LOGGER.info("String alulu reverse test");
        Assert.assertEquals(notPalindromeStringReversed,palindromeService2.getReversed());
    }
}