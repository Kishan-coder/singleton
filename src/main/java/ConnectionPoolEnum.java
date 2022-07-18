public enum ConnectionPoolEnum {
    INSTANCE;
    private ConnectionPoolEnum(){
        System.out.println("Only once in private constructor");
    }
}
