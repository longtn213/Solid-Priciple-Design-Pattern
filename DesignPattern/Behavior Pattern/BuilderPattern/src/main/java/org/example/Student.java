package org.example;

public class Student {

    private String name;
    private int age;
    private String unversity;

    public Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.unversity = builder.university;
    }

    public static class Builder {
        private final String name;
        private int age;
        private String university;

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return this.name +"-"+this.unversity +"-"+this.age;
    }
}
