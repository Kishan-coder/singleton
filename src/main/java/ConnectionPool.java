import org.springframework.context.annotation.Lazy;

//Connection pooling is a technique of creating and managing a pool of connections that are ready for use by any thread
// sthat needs them. Connection pooling can greatly increase the performance of your Java application, while reducing overall resource usage.
public class ConnectionPool {
    //one way the lazy initialization of instance
    //@Lazy
    private static ConnectionPool INSTANCE;//= new ConnectionPool();// the eager initialization
    //Private Constructor
    private ConnectionPool(){

    }
    // 1. static get Instance
    // 2. putting synchronized at method makes it less performant
    // 3. Move it to synchronized block
    // 4. Why to be so complex? Use Eager initialization
    public static synchronized ConnectionPool getInstance(){

        //second way: The double check Locking->  this check ensures that not all threads have to wait when they enter this method rather
        //only first few threads passes check at Line #21 and then they all fail check at L#23 except one that entered synchronized block first.
        if (INSTANCE == null) {
            synchronized (ConnectionPool.class) {
                if (null == INSTANCE) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }
        return INSTANCE;
    }

    // Cons of this approach:
    //1. SRP violated
    //2. Thread Safety is not garaunteed
}
