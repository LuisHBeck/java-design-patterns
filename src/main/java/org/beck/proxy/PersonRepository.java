package org.beck.proxy;

import org.beck.builder.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {

    private Map<Long, Person> db = new HashMap<>();
    private static Long countId = 1L;

    public void create(Person person) {
        db.put(countId++, person);
    }

    public Person findById(Long id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return db.get(id);
    }
}
