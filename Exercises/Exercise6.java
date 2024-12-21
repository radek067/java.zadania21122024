package Exercises;//Zadanie 4. Napisać program obliczający należny podatek
//dochodowy od osób fizycznych. Program ma pobierać od
//użytkownika dochód i po obliczeniu wypisywać na ekranie należny
//podatek. Podatek obliczany jest wg. następujących reguł:
//        • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//        • od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00


public class Exercise6 {
    public static void main(String[] args) {

        double income = Utils.input("Podaj dochód: ");

        double tax = 0;

        if (income <= 85_528) {
            tax = (income * 0.18 - 556.02);
        } else {
            tax = ((income - 85_528) * 0.32 + 14_839.02);
        }

        System.out.printf("Należny podatek wynosi: %.2f zł", (tax < 0 ? 0 : tax));
    }
}
