import org.junit.Assert;
import org.junit.Test;

public class ConnectionPoolStaticTest {
    @Test
    public void testGetInstance(){
        ConnectionPoolStatic pool1 = ConnectionPoolStatic.getInstance();
        ConnectionPoolStatic pool2 = ConnectionPoolStatic.getInstance();
        Assert.assertTrue("Checking equality of both pools.", pool1 == pool2);
    }
    @Test
    public void testGetInstance2(){
        ConnectionPoolStatic pool1 = ConnectionPoolStatic.getInstance2();
        ConnectionPoolStatic pool2 = ConnectionPoolStatic.getInstance2();
        Assert.assertTrue("Checking equality of both pools with getInstance2.", pool1 == pool2);
    }
}
