package xyz.edu;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class RectangularBoxTest {

    RectangularBox rectangularBox = new RectangularBox(0, 2,3,4);
    private static final Logger LOGGER = Logger.getLogger(RectangularBoxTest.class.getName());

    @Test
    public void whenRectangularBoxLength2Width3Height4ThenTotalArea52() {
        LOGGER.info("getTotalAreaTest");
        Assert.assertEquals(52,rectangularBox.getTotalArea());
    }

    @Test
    public void whenRectangularBoxLength2Width3Height4ThenBasementArea6() {
        LOGGER.info("getBasementAreaTest");
        Assert.assertEquals(6,rectangularBox.getBasementArea());

    }

    @Test
    public void whenRectangularBoxLength2Width3Height4ThenCapacity24() {
        LOGGER.info("getCapacityTest");
        Assert.assertEquals(24,rectangularBox.getCapacity());
    }

    @Test
    public void whenRectangularBoxLength2Width3Height4ThenArea52() {
        LOGGER.info("getAreaTest");
        Assert.assertEquals(52,rectangularBox.getArea(),0.01);
    }
}