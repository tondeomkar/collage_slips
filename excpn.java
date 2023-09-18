//write a java program to accept a number from user,if it zero then throw userdefined exception "number is zero",otherwise calculate the Wsum of first and last digit of that number.(use static keyword)

import java.util.Scanner;

class ZeroNumberException extends Exception {
    ZeroNumberException(String message) {
        super(message);
    }
}

public class excpn {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                throw new ZeroNumberException("Number is zero");
            }

            int sum = calculateSumOfFirstAndLastDigit(number);
            System.out.println("Sum of first and last digit: " + sum);
        } catch (ZeroNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
    }

    private static int calculateSumOfFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit = Character.getNumericValue(Integer.toString(number).charAt(0));
        return firstDigit + lastDigit;
    }
}
