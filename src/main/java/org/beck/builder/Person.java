package org.beck.builder;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String name;

    private String lastName;

    private String document;

    private String email;

    private String nickname;

    private LocalDate birthDate;

    private Person(String name, String lastName, String document, String email, String nickname, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
        this.nickname = nickname;
        this.birthDate = birthDate;
    }

    /*
     * INTERNAL BUILDER
     * cant create instance of this class with normal constructor
     * now normal constructor is private
     */
    public static class Builder {
        private String name;

        private String lastName;

        private String document;

        private String email;

        private String nickname;

        private LocalDate birthDate;

        // INTERNAL BUILDER
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder document(String document) {
            this.document = document;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Person createPerson() {
            return new Person(
                    name, lastName,
                    document, email,
                    nickname, birthDate
            );
        }
    }
}
