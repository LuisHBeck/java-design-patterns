package org.beck.singleton.problem;

public class ScheduleTest {
    public static void main(String[] args) {
        rentDay("Friday");
        rentDay("Sunday");
    }

    public static void rentDay(String day) {
        Schedule schedule = new Schedule();
        schedule.occupies(day);

        System.out.println(schedule.getAvailableDays());
    }
}
