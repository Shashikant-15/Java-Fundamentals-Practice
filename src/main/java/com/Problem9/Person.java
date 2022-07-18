package com.Problem9;

/**
 * create a Person Class having each
 * different name,addressId,city,flat & state.
 *
 * @author Shashikant
 * @version 11.0.11
 */
public class Person {

    int addressId;
    String name;
    String city;
    String Flat;
    String State;

    /**
     * parametrised constructor having different entities like-
     * @param addressId person's addressId.
     * @param name person's name.
     * @param city person's city where they belong.
     * @param flat person's flat num.
     * @param state person's state.
     */
    public Person(int addressId, String name, String city, String flat, String state) {
        this.addressId = addressId;
        this.name = name;
        this.city = city;
        Flat = flat;
        State = state;

    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }
}
