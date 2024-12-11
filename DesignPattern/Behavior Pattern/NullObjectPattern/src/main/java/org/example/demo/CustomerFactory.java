package org.example.demo;

public class CustomerFactory {

    private Database database;

    public CustomerFactory() {
        this.database = new Database();
    }

    public AbstractCustomer getCustomer(String name){
        if(customerExists(name)){
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    private boolean customerExists(String name) {
        return database.exist(name);
    }
}
