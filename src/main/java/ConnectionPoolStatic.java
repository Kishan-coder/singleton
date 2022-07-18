public class ConnectionPoolStatic {
    private static ConnectionPoolStatic INSTANCE;
    static{
        INSTANCE = new ConnectionPoolStatic();
    }
    private static class InstanceHolder{
        public static ConnectionPoolStatic INSTANCE= new ConnectionPoolStatic();
    }
    private ConnectionPoolStatic(){
        System.out.println("Creating Instance");
    }
    public static ConnectionPoolStatic getInstance(){
        return INSTANCE;
    }

    public static  ConnectionPoolStatic getInstance2(){
        return InstanceHolder.INSTANCE;
    }

    //Static initializers are run by the JVM at class initialization time, after class loading but before the class is used by any thread.
    //Because the JVM acquires a lock during initialization and this lock is acquired by each thread at least once to ensure that the class has been loaded,
    // memory writes made during static initialization are automatically visible to all threads

    /**
     *The lazy initialization holder class idiom uses a class whose only purpose is to initialize the Resource.
     *The JVM defers initializing the ResourceHolder class until it is actually used,
     *and because the Resource is initialized with a static initializer, no additional synchronization is needed.
     *The first call to getresource by any thread causes ResourceHolder to be loaded and initialized,
     * at which time the initialization of the Resource happens through the static initializer.
     **/

}
