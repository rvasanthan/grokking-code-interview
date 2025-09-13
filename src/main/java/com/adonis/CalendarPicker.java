package com.adonis;

public class CalendarPicker {

    public static void main(String[] args) {
        // Example usage
        int year = 2023;
        int month = 10; // October
        int day = 15;

        String calendar = generateCalendar(year, month, day);
        System.out.println(calendar);
    }
    public static String generateCalendar(int year, int month, int day) {
        StringBuilder calendar = new StringBuilder();
        calendar.append("Calendar for ").append(year).append("-").append(month).append("\n");
        calendar.append("Su Mo Tu We Th Fr Sa\n");

        // Calculate the first day of the month
        int firstDayOfMonth = getFirstDayOfMonth(year, month);
        int daysInMonth = getDaysInMonth(year, month);

        // Print leading spaces for the first week
        for (int i = 0; i < firstDayOfMonth; i++) {
            calendar.append("   ");
        }

        // Print the days of the month
        for (int dayCounter = 1; dayCounter <= daysInMonth; dayCounter++) {
            if (dayCounter == day) {
                calendar.append("[").append(dayCounter).append("]");
            } else {
                calendar.append(String.format("%2d ", dayCounter));
            }

            // Move to the next line after Saturday
            if ((firstDayOfMonth + dayCounter) % 7 == 0) {
                calendar.append("\n");
            }
        }

        return calendar.toString();
    }
    private static int getFirstDayOfMonth(int year, int month) {
        // Zeller's Congruence algorithm to calculate the first day of the month
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        return (1 + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;
    }
    private static int getDaysInMonth(int year, int month) {
        // Days in each month
        int[] daysInMonth = { 31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return daysInMonth[month - 1];
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
   

}
