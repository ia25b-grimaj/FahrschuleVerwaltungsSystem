package ch.fahrschule.methoden;

import java.util.Scanner;

public class Methoden {
    public int intUserInput(String displayText, int min, int max) {
        do {
            System.out.print(displayText);
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
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
            Scanner sc = new Scanner(System.in);
            double userInput = sc.nextDouble();
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
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt() == 2) {
                return false;
            } else {
                return true;
            }
        } while (true);
    }

    public String stringUserInput(String displayText) {
        System.out.print(displayText);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
