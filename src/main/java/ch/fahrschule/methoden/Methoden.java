package ch.fahrschule.methoden;

import java.util.Scanner;

public class Methoden {
    private final Scanner sc = new Scanner(System.in);

    public int intUserInput(String displayText, int min, int max) {
        do {
            System.out.print(displayText);
            int userInput = sc.nextInt();
            sc.nextLine();
            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.println("Gib eine Valide Zahl ein");
            }
        } while (true);
    }

    public double doubleUserInput(String displayText,  double min, double max) {
        do {
            System.out.print(displayText);
            double userInput = sc.nextDouble();
            sc.nextLine();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
            else {
                System.out.println("Gib eine Valide Zahl ein");
            }
        } while (true);
    }

    public boolean booleanUserInput(String displayText) {
        do {
            System.out.print(displayText);
            int userInput = sc.nextInt();
            if (userInput == 1) {
                return true;
            } else if (userInput == 2) {
                return false;
            }
        } while (true);
    }

    public String stringUserInput(String displayText) {
        System.out.print(displayText);
        return sc.nextLine();
    }
}
