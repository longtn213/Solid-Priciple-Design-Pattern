package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    List<Service> listOfServices;

    public Cache(){
        this.listOfServices = new ArrayList<>();
    }

    public Service getService(String jndiName){
        for (Service service : listOfServices){
            if(service.getName().equals(jndiName)){
                return service;
            }
        }
        return null;
    }
    public void addService(Service s){
        this.listOfServices.add(s);
    }
}
