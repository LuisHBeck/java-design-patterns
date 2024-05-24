package org.beck.proxy.solution;

import org.beck.builder.Person;
import org.beck.proxy.PersonService;

import java.time.LocalDate;

public class PersonProxyTest {
    public static void main(String[] args) {
        PersonService personService = new PersonService(new PersonProxyRepository());

        Person person = new Person.Builder()
                .name("Luis")
                .lastName("Beck")
                .nickname("beck")
                .birthDate(LocalDate.of(2004,06,19))
                .document("11122233344")
                .createPerson();

        personService.save(person);
        Person returnedPerson = personService.getPersonById(1L);
        System.out.println(returnedPerson);
    }
}
