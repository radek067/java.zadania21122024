package Exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
//        Zadanie 1. Napisać program służący do konwersji wartości
//        temperatury podanej w stopniach Celsjusza na stopnie w skali
//        Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)

        final double WARTOSC_MNOZNIKA = 9/5;
        final double SKLADNIK_DODAWANIA = 32;

        System.out.println("Program do konwersji stopni C na F");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * WARTOSC_MNOZNIKA) + SKLADNIK_DODAWANIA;

        System.out.println(celsius + " stopni Celsjusza to " + fahrenheit + " stopni Fahrenheita.");
    }

}
