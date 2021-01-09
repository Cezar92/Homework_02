package Homework_02.Point1.Ex11;

public class Ex_11Function {
    public static int getDaysInMonth(int month, int daysInMonth) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;

                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2: // February
                daysInMonth = 28;
                break;
        }
        return daysInMonth;
    }
}
