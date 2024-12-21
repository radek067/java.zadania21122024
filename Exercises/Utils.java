package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    static int input(String message) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print(message);
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano złą wartość");
            return input(message);
        }
    }

}
