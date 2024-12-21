package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Nasza pierwsza aplikacja");

        boolean done = false;

        while (!done) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Podaj liczbę: ");
                int number = input.nextInt();
                input.close();

                for (int i = 0; i < number; i++) {
                    for (int j = 1; j <= number; j++) {
                        if (j < number) {
                            System.out.print(j + ", ");
                        } else {
                            System.out.print(j);
                        }
                    }
                    System.out.println();
                }

                done = true;
            } catch (InputMismatchException exception) {
                System.out.println("Proszę podać liczbę całkowitą");
            }

        }
    }
}

