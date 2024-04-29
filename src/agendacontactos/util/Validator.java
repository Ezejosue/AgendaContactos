/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos.util;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Validator {

    private static final Scanner scanner = new Scanner(System.in);

    public static int validateMenuOption(String message) {
        int option = 0;
        boolean isValid = false;
        do {
            System.out.print(message);
            try {
                String input = scanner.nextLine();
                if (!input.isEmpty()) {
                    option = Integer.parseInt(input);
                    isValid = true;
                } else {
                    System.out.println("Please enter a valid option: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid option: ");
            }
        } while (!isValid);
        return option;
    }

    public static String getNonEmptyString(String message) {
        String input = "";
        do {
            System.out.print(message);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Please enter a valid data.");
            }
        } while (input.isEmpty());
        return input;
    }

    public static int getInt(String message) {
        int input = 0;
        boolean isValid = false;
        do {
            System.out.print(message);
            try {
                input = Integer.parseInt(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        } while (!isValid);
        return input;
    }
}
