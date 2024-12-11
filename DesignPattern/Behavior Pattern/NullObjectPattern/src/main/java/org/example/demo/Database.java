package org.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<String> customerName;

    public Database(){
        this.customerName = new ArrayList<>();
        this.customerName.add("Adam");
        this.customerName.add("Jow");
        this.customerName.add("Long");
        this.customerName.add("Ana");
        this.customerName.add("Liz");
    }

    public boolean exist(String name){
        for (String customer : customerName){
            if(customer.equals(name)){
                return true;
            }
        }
        return false;
    }


}
