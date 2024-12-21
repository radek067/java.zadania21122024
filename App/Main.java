package App;

import jdk.jshell.execution.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = Utils.initData();
        Util.printBanner(: "Panel administracyjny firmy " + company.getName());

        Company company = Utils.initData();



        boolean done = false;

        while (!done) {
            System.out.println("Dostępne operacje: ");
            System.out.println("1 - Wyświetl pracowników");
            System.out.println("2 - Dodaj pracownika");
            System.out.println("0 - Zakończ program");
            int choice = Utils.inputInt("Wybierz operację: ");

            switch (choice) {
                case 1:
                    System.out.println();
                    Utils.printAnswer(company.getEmployees().toString());
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    String name = Utils.inputString("Podaj imię: ");
                    String surname = Utils.inputString("Podaj nazwisko: ");
                    company.getEmployees().add(new Employee(new Person(name, surname), null));
                    System.out.println("Dodano nowego pracownika");
                    System.out.println();
                    break;
                case 0:
                    System.out.println();
                    Utils.printAnswer("Do zobaczenia");
                    System.out.println();
                    done = true;
                    break;
                default:
                    System.out.println();
                    Utils.printAnswer("Podano błędną wartość, spróbuj jeszcze raz");
                    System.out.println();
            }
        }
    }
}
