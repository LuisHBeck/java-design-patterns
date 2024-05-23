package org.beck.builder.solution;

import org.beck.builder.Person;

import java.time.LocalDate;

// EXTERNAL BUILDER
public class PersonBuilder {
    private String name;

    private String lastName;

    private String document;

    private String email;

    private String nickname;

    private LocalDate birthDate;

    /*
     * all methods return the object,
     * so we can call another method next to this method
     * e.g. new PersonBuilder().name("").lastName();
     */

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder document(String document) {
        this.document = document;
        return this;
    }

    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public PersonBuilder birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /*public Person createPerson() {
        return new Person(
                name, lastName,
                document, email,
                nickname, birthDate
        );
    }*/
}
