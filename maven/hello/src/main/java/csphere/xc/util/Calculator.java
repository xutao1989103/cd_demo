package csphere.xc.util;

/**
 * Created by xtao on 2016/1/8.
 */
public class Calculator {

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        return a - b;
    }

    public int square(int n) {
        return n * n;
    }

    public int divide(int a, int b) throws Exception {
        if (0 == b) {
            throw new Exception("b cannot be zero");
        }
        return a / b;
    }
}
