import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.Thread.sleep;

public class Class1 {

    private Mathematics m;
    private static int x = 15;
    private static int y = 5;

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void treatDown() throws Exception {
        System.out.println("@AfterMethod");
    }

    @BeforeClass
    public void beforeClass() throws Exception {
        m = new Mathematics();
    }

    @BeforeTest
    public void beforeTest() throws Exception {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() throws Exception {
        System.out.println("@AfterTest");
    }

    @AfterClass
    public void afterClass() throws Exception {
        System.out.println("@AfterClass");
    }

    @Test(groups = {"smoke", "fast"})
    public void addTest() {
        m.add(x, y);
        Assert.assertEquals(x + y, m.getResult());
    }

    @Test(groups = {"fast"})
    public void deductTest() {
        m.setResult(456454);
        m.deduct(x, y);
        Assert.assertEquals(x - y, m.getResult());
    }

    @Test(groups = {"fast"})
    public void multiplyTest() {
        m.multiply(x, y);
        Assert.assertEquals(x * y, m.getResult());
    }

    @Test(groups = {"fast"})
    public void divideTest() {
        m.divide(x, y);
        Assert.assertEquals(x / y, m.getResult());
    }

    @Test(timeOut = 100)
    public void checkTimeOut() throws Exception {
        int i = 1;
        while (true) {
            System.out.print(i + " ");
            i++;
        }
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testException() {
        m.divide(10, 0);
        Assert.assertEquals(0, m.getResult());
    }

}
