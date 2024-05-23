package org.beck.singleton.problem;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@ToString
public class Schedule {
    private Map<String, Boolean> availableDays = new HashMap<>();

    public Schedule() {
        availableDays.put("Sunday", Boolean.TRUE);
        availableDays.put("Monday", Boolean.TRUE);
        availableDays.put("Tuesday", Boolean.TRUE);
        availableDays.put("Wednesday", Boolean.TRUE);
        availableDays.put("Thursday", Boolean.TRUE);
        availableDays.put("Friday", Boolean.TRUE);
        availableDays.put("Saturday", Boolean.TRUE);
    }

    public void occupies(String day) {
        availableDays.replace(day, Boolean.FALSE);
    }
}
