package org.beck.singleton.solution.eager;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@ToString
public class SingletonScheduleEAGER {
    /*
     * works with a single instance
     * EAGER -> attributes are loaded at app startup
     */
    private static final SingletonScheduleEAGER INSTANCE = new SingletonScheduleEAGER();

    private Map<String, Boolean> availableDays = new HashMap<>();

    private SingletonScheduleEAGER() {
        availableDays.put("Sunday", Boolean.TRUE);
        availableDays.put("Monday", Boolean.TRUE);
        availableDays.put("Tuesday", Boolean.TRUE);
        availableDays.put("Wednesday", Boolean.TRUE);
        availableDays.put("Thursday", Boolean.TRUE);
        availableDays.put("Friday", Boolean.TRUE);
        availableDays.put("Saturday", Boolean.TRUE);
    }

    public static SingletonScheduleEAGER getInstance() {
        return INSTANCE;
    }

    public void occupies(String day) {
        availableDays.replace(day, Boolean.FALSE);
    }
}
