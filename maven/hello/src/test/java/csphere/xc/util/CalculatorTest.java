package csphere.xc.util;


import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by xtao on 2016/1/8.
 */
public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    public void testAdd() {
        int result = calculator.add(3, 4);
        Assert.assertEquals(result, 7);
    }

    @Test
    public void testMinus() {
        int result = calculator.minus(6, 4);
        Assert.assertEquals(result, 2);
    }

    @Parameter
    @Test
    public void testDivide() {
        int result = 0;
        try {
            result = calculator.divide(9, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testSqure() {
        int result = calculator.square(3);
        Assert.assertEquals(result, 9);
    }

}
