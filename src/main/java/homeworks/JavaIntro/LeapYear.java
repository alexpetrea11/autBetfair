package homeworks.JavaIntro;

public class LeapYear {

    public static void getDaysInFebruary(int year) {
        if (isValidYear(year)) {
            if (isLeapYear(year)) {
                System.out.println("The February month from " + year + " had 29 days");
            } else {
                System.out.println("The February month from " + year + " had 28 days");
            }
        } else {
            System.out.println("Please enter a year between 1900 and 2016");
        }
    }

    private static boolean isValidYear(int year) {
        return year >= 1900 && year <= 2016;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
    }
}
