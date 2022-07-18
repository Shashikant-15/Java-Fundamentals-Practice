package com.Problem9;

import java.util.ArrayList;
import java.util.List;
/**
 * create an Address Class having each
 * different name,addressId,city,flat & state.
 *
 * @author Shashikant
 * @version 11.0.11
 */
public class Address {
    /**
     * main method implemented
     * @param args arguments
     */
        public static void main(String[] args) {

            List<Person> personList = new ArrayList<Person>();

            personList.add(new Person(101,"Shashi", "Ranchi", "DS/11/A", "Jharkhand"));
            personList.add(new Person(102, "Vasudev","Gorakhpur", "Ag/1/C", "UP"));
            personList.add(new Person(103, "Krishna","Bijnor", "dfg", "UP"));
            personList.add(new Person(104, "Ankit","Meerut", "DS/22/g", "UK"));
            personList.add(new Person(105, "Ravi","Moradabad", "hj", "UP"));
            personList.add(new Person(106, "Mohit","Jaipur", "er", "RJ"));

            // display list of all cities
            System.out.println("List of all Cities:::- ");

            personList.stream()
                    .map(Person::getCity)
                    .distinct()
                    .forEach(System.out::println);
        }

    }
