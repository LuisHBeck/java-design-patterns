package org.beck.singleton.solution.eager;

public class SingletonScheduleTestEAGER {
    public static void main(String[] args) {
        rentDay("Friday");
        rentDay("Sunday");
    }

    public static void rentDay(String day) {
        SingletonScheduleEAGER schedule = SingletonScheduleEAGER.getInstance();
        schedule.occupies(day);

        System.out.println(schedule.getAvailableDays());
    }
}
