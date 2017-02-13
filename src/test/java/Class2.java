import org.testng.Assert;
import org.testng.annotations.Test;


public class Class2 {

    @Test
    public void emptyTest() {
        System.out.println("It is an empty test from Class2");
    }

    @Test(enabled = false) //This test should be ignored
    public void ignoredTest() {
        Mathematics m = new Mathematics();
        m.multiply(10, 5);
        Assert.assertEquals(50, m.getResult());
    }
}
