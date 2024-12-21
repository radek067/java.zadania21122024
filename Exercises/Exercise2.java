package Exercises;//        Zadanie 2. Wczytać od użytkownika 3 liczby całkowite i wypisać na
//        ekran największą oraz najmniejszą z nich.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int thirdNumber = scanner.nextInt();

        int maximumNumber;
        int minimumNumber;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            maximumNumber = firstNumber;
        } else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
            maximumNumber = secondNumber;
        } else {
            maximumNumber = thirdNumber;
        }

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            minimumNumber = firstNumber;
        } else if (secondNumber < thirdNumber && secondNumber < firstNumber) {
            minimumNumber = secondNumber;
        } else {
            minimumNumber = thirdNumber;
        }

        System.out.println("Największa liczba to: " + maximumNumber);
        System.out.println("Najmniejsza liczba to: " + minimumNumber);
    }
}
