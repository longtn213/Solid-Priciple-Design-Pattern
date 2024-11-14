package database;

// low level module
public class MySqlDatabase implements Database {
    @Override
    public void connect(){
        System.out.println("Connecting to a MySQL database...");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnecting from MySQL database...");
    }

}
