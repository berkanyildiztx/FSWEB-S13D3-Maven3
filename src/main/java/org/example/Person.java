package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int height;
    private double weight;

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, null, 0, 0.0);
    }

    public Person(String firstName, String lastName, int age, String gender, int height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
