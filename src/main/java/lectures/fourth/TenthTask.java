package lectures.fourth;

import java.time.DayOfWeek;

public class TenthTask {

    public enum DaysOfWeek {

        SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
        private int number;

        DaysOfWeek(int number) {

            this.number = number;
        }
    }

    public TenthTask() {

        System.out.println("\n---------------------");
        System.out.println("Tenth task solution:\n");
    }

    public static void main(String[] args) {

        DayOfWeek today = java.time.LocalDate.now().getDayOfWeek();
        switch (today) {

            case SUNDAY:
                System.out.println(DaysOfWeek.SUNDAY.number);
                break;

            case MONDAY:
                System.out.println(DaysOfWeek.MONDAY.number);
                break;

            case TUESDAY:
                System.out.println(DaysOfWeek.TUESDAY.number);
                break;

            case WEDNESDAY:
                System.out.println(DaysOfWeek.WEDNESDAY.number);
                break;

            case THURSDAY:
                System.out.println(DaysOfWeek.THURSDAY.number);
                break;

            case FRIDAY:
                System.out.println(DaysOfWeek.FRIDAY.number);
                break;

            case SATURDAY:
                System.out.println(DaysOfWeek.SATURDAY.number);

        }
    }
}
