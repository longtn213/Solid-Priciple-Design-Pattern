public enum Database {

    // acquiring the INSTANCE is thread safe
    INSTANCE;

    public void connect() {
        System.out.println("Connected to Database");
    }
    public void disconnect() {
        System.out.println("Disconnected from Database");
    }
}
