package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        CustomerFactory factory = new CustomerFactory();
//        System.out.println(factory.getCustomer("Phuong").getCustomerName());
        List<Book> books = new ArrayList<>();
        books.add(new Book("hello", "Long", 560, Type.PHILOSOPHY));
        books.add(new Book("hi", "loan", 22, Type.NOVEL));
        books.add(new Book("good morning", "Lung", 33, Type.THRILLER));
        books.add(new Book("good evening", "Ly", 41, Type.FICTION));
        books.add(new Book("good afternoon", "phuong", 12, Type.HISTORY));
        books.add(new Book("chao ban", "Minh", 656, Type.NOVEL));

        books.stream().filter(book -> book.getType() == Type.HISTORY).findAny()
                .ifPresent(System.out::println);
    }
}