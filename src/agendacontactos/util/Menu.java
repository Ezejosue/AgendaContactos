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
public class Menu {

    public static int showMenu(Scanner scanner) {
        System.out.println("\n*** Contact Agenda ***");
        System.out.println("1. Add Contact");
        System.out.println("2. Search Contact");
        System.out.println("3. Modify Contact");
        System.out.println("4. Delete Contact");
        System.out.println("5. Show Contacts");
        System.out.println("6. Clear Agenda");
        System.out.println("7. Exit");
        System.out.print("Select an option: ");
        return scanner.nextInt();
    }
}
