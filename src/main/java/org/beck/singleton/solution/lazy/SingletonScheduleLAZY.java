package org.beck.singleton.solution.lazy;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Getter
@ToString
public class SingletonScheduleLAZY {
    /*
     * works with a single instance
     * LAZY -> attributes are loaded when called
     */
    private static SingletonScheduleLAZY INSTANCE = null;

    private Map<String, Boolean> availableDays = new HashMap<>();

    private SingletonScheduleLAZY() {
        availableDays.put("Sunday", Boolean.TRUE);
        availableDays.put("Monday", Boolean.TRUE);
        availableDays.put("Tuesday", Boolean.TRUE);
        availableDays.put("Wednesday", Boolean.TRUE);
        availableDays.put("Thursday", Boolean.TRUE);
        availableDays.put("Friday", Boolean.TRUE);
        availableDays.put("Saturday", Boolean.TRUE);
    }

    public static SingletonScheduleLAZY getInstance() {
        if(Objects.isNull(INSTANCE)) {
            INSTANCE = new SingletonScheduleLAZY();
        }
        return INSTANCE;
    }

    public void occupies(String day) {
        availableDays.replace(day, Boolean.FALSE);
    }
}
