package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Long","hello").setAge(15).setAddress("MOR").build();

        System.out.println(person);

        Student student = new Student.Builder("Long", "FPT").setAge(14).build();

        System.out.println(student);
    }
}