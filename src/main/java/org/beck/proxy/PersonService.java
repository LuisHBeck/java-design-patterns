package org.beck.proxy;

import org.beck.builder.Person;
import org.beck.proxy.solution.PersonProxyRepository;

public class PersonService {

    private PersonProxyRepository personRepository;

    public PersonService(PersonProxyRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(Person person) {
        personRepository.create(person);
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id);
    }
}
