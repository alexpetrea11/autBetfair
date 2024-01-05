package homeworks.JavaIntro;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
            System.out.println("Menu:");
            System.out.println("1. Sum of Numbers");
            System.out.println("2. Prime Numbers");
            System.out.println("3. Leap Year");
            System.out.println("0. Exit");
            do{
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SumOfNumbers sumOfNumbers = new SumOfNumbers();
                    int sum = sumOfNumbers.addition();
                    System.out.println("Sum of the first 100 numbers: " + sum);
                    break;
                case 2:
                    System.out.println("Prime numbers until 1000000:");
                    PrimeNumbers.findPrimeNumbers();
                    break;
                case 3:
                    System.out.println("Enter a year between 1900-2016");
                    int yearChosen;
                    yearChosen=scanner.nextInt();
                    LeapYear.getDaysInFebruary(yearChosen);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(true);
}
}
