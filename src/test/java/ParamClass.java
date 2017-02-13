import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ParamClass {

    @DataProvider(name = "parameterizedTest")
    public Object[][] simpleDataProvider() {
        return new Object[][]{
                {2, 2, 4},
                {10, 10, 20},
                {14, 2, 12},
                {15, 3, 5}
        };
    }

    @Test(dataProvider = "parameterizedTest", priority = 3)
    public void checkAddParameters(int firstParam, int secondParam, int expectedResult) {
        Mathematics m = new Mathematics();
        m.add(firstParam, secondParam);
        int result = m.getResult();
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "parameterizedTest", priority = 0)
    public void checkDeductParameters(int firstParam, int secondParam, int expectedResult) {
        Mathematics m = new Mathematics();
        m.setResult(456454);
        m.deduct(firstParam, secondParam);
        int result = m.getResult();
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "parameterizedTest", priority = 1)
    public void checkMultiplyParameters(int firstParam, int secondParam, int expectedResult) {
        Mathematics m = new Mathematics();
        m.multiply(firstParam,secondParam);
        int result = m.getResult();
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "parameterizedTest", priority = 2)
    public void checkDivideParameters(int firstParam, int secondParam, int expectedResult) {
        Mathematics m = new Mathematics();
        m.divide(firstParam, secondParam);
        int result = m.getResult();
        Assert.assertEquals(result, expectedResult);
    }
}
