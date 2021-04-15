package com.sii;

public class Actors {

    private String firstName;
    private String lastName;

    public Actors(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
