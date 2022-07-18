import org.junit.Assert;
import org.junit.Test;

public class ConnectionPoolEnumTest {
    @Test
    public void testGetInstance(){
        ConnectionPoolEnum pool1 = ConnectionPoolEnum.INSTANCE;
        ConnectionPoolEnum pool2 = ConnectionPoolEnum.INSTANCE;
        Assert.assertTrue("Equality of pool1 and pool2", pool1 == pool2);
    }
}
