import org.junit.Assert;
import org.junit.Test;

public class ConnectionPoolTest {

    @Test
    public void testGetInstance(){
        ConnectionPool pool1 = ConnectionPool.getInstance();
        ConnectionPool pool2 = ConnectionPool.getInstance();
        Assert.assertTrue("Pool instances should be equal if singleton.", pool1 == pool2);
    }

    // Cons of this approach:
    //1. SRP violated
    //2. Thread Safety is not garaunteed
}
