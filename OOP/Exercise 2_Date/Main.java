import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        
        try {
        //System.out.print("Input year: ");
        year = userInput.nextInt();
        } catch (Exception x) {
            System.err.println("Invalid year input");
            System.exit(0);
        }

        try {
        //System.out.print("Input month: ");
        month = userInput.nextInt();
        } catch (Exception x) {
            System.err.println("Invalid month input");
            System.exit(0);
        }

        try {
        //System.out.print("Input day: ");
        day = userInput.nextInt();
        } catch (Exception x) {
            System.err.println("Invalid day input");
            System.exit(0);
        }
        
        // LEAP YEAR or COMMON YEAR
        String leapYear;
        if (LeapYear(year)) {
            leapYear = "Leap Year";
        } else {
            leapYear = "Common Year";
        }

        // MONTH NAME
        String monthName = Month(month);

        // DAYS
        int numDays = numDays(day, month, year);

        // OUTPUT
        if (0 > day || numDays(numDays, month, year) < day) {
            System.out.println("Invalid number of days");
        } else if (monthName == "Invalid") {
            System.out.println("Invalid number of months");
        } else {
            System.out.println(monthName + " " + day + ", " + year);
            System.out.println(numDays + " days");
            System.out.println(year + " is a " + leapYear);
        }

        userInput.close();

    }

    public static boolean LeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String Month(int month) {
        String monthName;

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid";
                break;
        }
        return monthName;
    }

    public static int numDays(int day, int month, int year) {

        if (month < 8) {
            if (month == 2) {
                if (LeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            } else if (month % 2 == 0) {
                return 30;
            } else {
                return 31;
            }
        } else {
            if (month % 2 == 0) {
                return 31;
            } else {
                return 30;
            }
        }
    }
}
