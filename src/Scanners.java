import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the total bill for the meal?: $");
        double billTotal = scanner.nextDouble();

        System.out.print("How many people are splitting the bill?: ");
        int numberOfGuests = scanner.nextInt();

        /* System.out.print("Amount of money in your pocket: $");
        double money = scanner.nextDouble(); */

        System.out.println();

        double billSplit = (billTotal / numberOfGuests);
        //int doubledAge = age * 2;
//        int characterCount = firstName.length();

        System.out.format("Your total bill for the meal comes to $%.2f and since there are only %2d of us, we will only have to pay $%.2f-- not including the fat ass tip for the server.", billTotal, numberOfGuests, billSplit);
//        System.out.format(firstName + " has " + firstName.length() + " characters in its name.");
    }

}