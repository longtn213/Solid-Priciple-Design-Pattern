package org.example.demo;

public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCustomerName() {
        return "The customer does not exist...";
    }
}
