class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1971(date1) - daysFrom1971(date2));
    }
    private int daysFrom1971(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int days = 0;
        for (int y = 1971; y < year; y++) {
            days += isLeapYear(y) ? 366 : 365;
        }
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int m = 1; m < month; m++) {
            days += monthDays[m - 1];
            if (m == 2 && isLeapYear(year)) {
                days += 1; 
            }
        }
        days += day;

        return days;
    }
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
