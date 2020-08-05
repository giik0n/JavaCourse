package xyz.edu;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(3,4);
    private static final Logger LOGGER = Logger.getLogger(RectangleTest.class.getName());

    @org.junit.Test
    public void whenHeight3Width4ThenArea12() {
        LOGGER.info("getAreaTest");
        Assert.assertEquals(12,rectangle.getArea(),0.01);
    }

    @Test
    public void whenHeight3Width4ThenPerimeter14() {
        LOGGER.info("getPerimeterTest");
        Assert.assertEquals(14,rectangle.getPerimeter(),0.01);
    }
}