package org.example;

public class NameRepository {
    private String[] names ={"Adam","Eva","Ana","Micheal"};

    public Iterator2 getIterator() {
        return new NameIterator(names);
    }
}
