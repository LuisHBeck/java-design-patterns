package org.beck.builder.solution;

import org.beck.builder.Person;

import java.time.LocalDate;

public class TestPersonWithBuilder {

    public static void main(String[] args) {
        // USING EXTERNAL BUILDER
        /* Person person = new PersonBuilder()
                .name("Luis")
                .lastName("Beck")
                .nickname("beck")
                .email("beck@gmail.com")
                .birthDate(LocalDate.of(2004,06,19))
                .document("867.929.200-10")
                .createPerson(); // PersonBuilder to Person
        */
        // System.out.println(person);

        Person person = new Person.Builder()
                .name("Luis")
                .lastName("Beck")
                .nickname("beck")
                .email("beck@gmail.com")
                .birthDate(LocalDate.of(2004,06,19))
                .document("867.929.200-10")
                .createPerson(); // PersonBuilder to Person

        System.out.println(person);

        // e.g. of own Java builder pattern implementation
        StringBuilder string = new StringBuilder()
                .append("This is ").append("an example");
        System.out.println(string);
    }
}
