package Exercises;//Zadanie 6. Napisać program realizujący funkcje prostego kalkulatora,
//pozwalającego na wy- konywanie operacji dodawania, odejmowania,
//mnożenia i dzielenia na dwóch licz- bach rzeczywistych. Program ma
//identyfikować sytuację wprowadzenia błędnego symbolu działania
//oraz próbę dzielenia przez zero. Zastosować instrukcję switch do
//wykonania odpowiedniego działania w zależności od
//wprowadzonego symbolu operacji. Scenariusz działania programu:
//a) Program wyświetla informację o swoim przeznaczeniu.
//b) Wczytuje pierwszą liczbę.
//c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//d) Wczytuje drugą liczbę.
//e) Wyświetla wynik lub - w razie konieczności - informację o niemożności
//wy- konania działania.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Prosty kalkulator");
        System.out.println("-----------------");

        int a = Utils.input("Podaj pierwszą liczbę: ");
        String sign = inputString("Podaj znak operacji (+, -, *, /): ");
        int b = Utils.input("Podaj pierwszą liczbę: ");

        System.out.println("-----------------");

        switch (sign) {
            case "+":
                System.out.println("%d + %d = %d".formatted(a, b, (a + b)));
                break;
            case "-":
                System.out.printf("%d - %d = %d%n", a, b, (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case "/":
                if (b==0){
                    System.out.println("b is zero");
                } else {
                    System.out.println("a / b = " + (a / b));
                }
                break;
            default:
                System.out.println("Podano błędną operację");
        }
    }

   static String inputString(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine();
    }
}
