package Exercises;//Zadanie 5. W sklepie ze sprzętem AGD oferowana jest sprzedaż
//ratalna. Napisz program umożliwiający wyliczenie wysokości
//miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla
//programu są:
//        • cena towaru (od 100 zł do 10 tyś. zł), • liczba rat (od 6 do 48).
//Kredyt jest oprocentowany w zależności od liczby rat:
//        • od 6–12 wynosi 2.5% , • od 13–24 wynosi 5%, • od 25–48 wynosi 10%.
//Obliczona miesięczna rata powinna zawierać również odsetki.
//Program powinien sprawdzać, czy podane dane mieszczą się w
//określonych powyżej zakresach, a w przypadku błędu pytać prosić
//użytkownika ponownie o podanie danych.

public class Exercise3 {
    public static void main(String[] args) {

        int price = Utils.input("Podaj cenę towaru: ");
        int rate = Utils.input("Podaj liczbę rat: ");

        printSeparator();

        if (isParameterInvalid(price, rate)) {
            showError();
        } else {
            showResult(price, rate);
        }
    }

    static void printSeparator() {
        System.out.println("-----------------------");
    }

    static boolean isParameterInvalid(int price, int rate) {
        return price < 100 || price > 10_000 || rate < 6 || rate > 48;
    }

    private static void showError() {
        System.out.println("Podano błędne dane !!!");
        System.out.println("Cena powinna być w przedziale od 100zł do 10 000zł");
        System.out.println("Liczba rat powinna być w przedziale od 6 do 48");
    }

    private static void showResult(int price, int rate) {
        double interest = price * getMultiplier(rate);
        double total = price + interest;
        double rateValue = total / rate;

        System.out.println("Odsetki: " + interest + "zł");
        System.out.println("Łączny koszt: " + total + "zł");
        System.out.println("Wysokość raty: " + rateValue + "zł");
    }

    static double getMultiplier(int rate) {
        if (rate <= 12) {
            return 0.025;
        } else if (rate <= 24) {
            return 0.05;
        } else {
            return 0.1;
        }
    }
}
