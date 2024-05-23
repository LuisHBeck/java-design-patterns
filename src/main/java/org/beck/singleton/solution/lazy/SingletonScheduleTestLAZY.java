package org.beck.singleton.solution.lazy;

public class SingletonScheduleTestLAZY {
    public static void main(String[] args) {
        rentDay("Friday");
        rentDay("Sunday");
    }

    public static void rentDay(String day) {
        SingletonScheduleLAZY schedule = SingletonScheduleLAZY.getInstance();
        schedule.occupies(day);

        System.out.println(schedule.getAvailableDays());
    }
}
