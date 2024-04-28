/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

import agendacontactos.modelos.Agenda;
import agendacontactos.modelos.Contact;
import java.util.Scanner;
import util.ClearScreen;
import util.Menu;

/**
 *
 * @author Ezequiel
 */
public class AgendaContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean exit = false;

        while (!exit) {
            ClearScreen.clear();
            int option = Menu.showMenu(scanner);
            scanner.nextLine();
            ClearScreen.clear();

            switch (option) {
                case 1:
                    System.out.println("Enter the name of the contact: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the contact's phone number: ");
                    String phone = scanner.nextLine();
                    ClearScreen.clear();
                    agenda.addContact(new Contact(name, phone));
                    break;
                case 2:
                    System.out.println("Enter the name of the contact to search for: ");
                    String nameSearch = scanner.nextLine();
                    ClearScreen.clear();
                    agenda.searchContact(nameSearch);
                    break;
                case 3:
                    System.out.println("Enter the name of the contact to be modified: ");
                    String nameModify = scanner.nextLine();
                    ClearScreen.clear();
                    agenda.modifyContact(nameModify);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact to delete: ");
                    String nameDelete = scanner.nextLine();
                    ClearScreen.clear();
                    agenda.deleteContact(nameDelete);
                    break;
                case 5:
                    agenda.showContacts();
                    break;
                case 6:
                    agenda.clearAgenda();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        System.out.println("Thank you for using our service.");
    }

}
