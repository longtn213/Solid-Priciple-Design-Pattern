package database;

// this is another low level module
public class OracleDatabase implements Database {
    @Override
    public void connect(){
        System.out.println("Connecting to a Oracle database...");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnecting from Oracle database...");
    }
}
