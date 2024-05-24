package org.beck.proxy.solution;

import org.beck.builder.Person;
import org.beck.proxy.PersonRepository;

import java.util.logging.Logger;

public class PersonProxyRepository extends PersonRepository {
    private static Logger log = Logger.getLogger(PersonProxyRepository.class.getName());

    @Override
    public void create(Person person) {
        log.info("initialize create method call");
        super.create(person);
        log.info("create method call finished");
    }

    @Override
    public Person findById(Long id) {
        log.info("initialize findById method call");
        Person person = super.findById(id);
        log.info("findById method call finished");
        return person;
    }
}
