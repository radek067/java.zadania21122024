package Exercises;

public class Exercise5 {
    public static void main(String[] args) {
        int firstNumber = Utils.input("Podaj pierwszą liczbę: ");
        int secondNumber = Utils.input("Podaj drugą liczbę: ");
        int thirdNumber = Utils.input("Podaj trzecią liczbę: ");

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
