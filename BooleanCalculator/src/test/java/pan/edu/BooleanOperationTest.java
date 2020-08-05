package pan.edu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanOperationTest {

    BooleanOperation booleanOperation00 = new BooleanOperation(false,false);
    BooleanOperation booleanOperation01 = new BooleanOperation(false,true);
    BooleanOperation booleanOperation0Null = new BooleanOperation(false,null);

    BooleanOperation booleanOperation10 = new BooleanOperation(true,false);
    BooleanOperation booleanOperation11 = new BooleanOperation(true,true);
    BooleanOperation booleanOperation1Null = new BooleanOperation(true,null);

    BooleanOperation booleanOperationNull0 = new BooleanOperation(null,false);
    BooleanOperation booleanOperationNull1 = new BooleanOperation(null,true);
    BooleanOperation booleanOperationNullNull = new BooleanOperation(null,null);

    @Test
    public void whenConjunctionFirst0Second0ThenFalse(){
        Assert.assertEquals(false,booleanOperation00.conjunction());
    }
    @Test
    public void whenDisjunctionFirst0Second0ThenFalse(){
        Assert.assertEquals(false,booleanOperation00.disjunction());
    }

    @Test
    public void whenConjunctionFirst0Second1ThenFalse(){
        Assert.assertEquals(false,booleanOperation01.conjunction());
    }
    @Test
    public void whenDisjunctionFirst0Second1ThenTrue(){
        Assert.assertEquals(true,booleanOperation01.disjunction());
    }

    @Test
    public void whenConjunctionFirst0SecondNullThenNull(){
        Assert.assertEquals(null,booleanOperation0Null.conjunction());
    }
    @Test
    public void whenDisjunctionFirst0SecondNullThenFalse(){
        Assert.assertEquals(false,booleanOperation0Null.disjunction());
    }

    //-----
    @Test
    public void whenConjunctionFirst1Second0ThenFalse(){
        Assert.assertEquals(false,booleanOperation10.conjunction());
    }
    @Test
    public void whenDisjunctionFirst01Second0ThenTrue(){
        Assert.assertEquals(true,booleanOperation10.disjunction());
    }

    @Test
    public void whenConjunctionFirst1Second1ThenFalse(){
        Assert.assertEquals(true,booleanOperation11.conjunction());
    }
    @Test
    public void whenDisjunctionFirst1Second1ThenTrue(){
        Assert.assertEquals(true,booleanOperation11.disjunction());
    }

    @Test
    public void whenConjunctionFirst1SecondNullThenNull(){
        Assert.assertEquals(null,booleanOperation1Null.conjunction());
    }
    @Test
    public void whenDisjunctionFirst1SecondNullThenTrue(){
        Assert.assertEquals(true,booleanOperation1Null.disjunction());
    }
    //--
    @Test
    public void whenConjunctionFirstNullSecond0ThenFalse(){
        Assert.assertEquals(null,booleanOperationNull0.conjunction());
    }
    @Test
    public void whenDisjunctionFirstNullSecond0ThenFalse(){
        Assert.assertEquals(false,booleanOperationNull0.disjunction());
    }

    @Test
    public void whenConjunctionFirstNullSecond1ThenFalse(){
        Assert.assertEquals(null,booleanOperationNull1.conjunction());
    }
    @Test
    public void whenDisjunctionFirstNullSecond1ThenTrue(){
        Assert.assertEquals(true,booleanOperationNull1.disjunction());
    }

    @Test
    public void whenConjunctionFirstNullSecondNullThenNull(){
        Assert.assertEquals(null,booleanOperationNullNull.conjunction());
    }
    @Test
    public void whenDisjunctionFirstNullSecondNullThenNull(){
        Assert.assertEquals(null,booleanOperationNullNull.disjunction());
    }
}