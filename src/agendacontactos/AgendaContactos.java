/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

import agendacontactos.modelos.Agenda;
import agendacontactos.modelos.Contact;
import java.util.Scanner;
import agendacontactos.util.ClearScreen;
import agendacontactos.util.Menu;
import agendacontactos.util.Validator;

/**
 *
 * @author Ezequiel
 */
/**
 * The main class to run the contact agenda application.
 */
public class AgendaContactos {

    /**
     * The main method to start the application.
     *
     * @param args the command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for user input
        Agenda agenda = new Agenda(); // Agenda object to manage contacts
        boolean exit = false; // Flag to control program termination

        while (!exit) {
            ClearScreen.clear(); // Clears the console screen
            int option = Menu.showMenu(scanner); // Displays the menu and gets user input

            ClearScreen.clear();

            switch (option) {
                case 1:
                    // Add a new contact
                    String name = Validator.getNonEmptyString("Enter the name of the contact: ");
                    String phone = Validator.getNonEmptyString("Enter the contact's phone number: ");
                    ClearScreen.clear();
                    agenda.addContact(new Contact(name, phone));
                    break;
                case 2:
                    // Search for a contact
                    String nameSearch = Validator.getNonEmptyString("Enter the name of the contact to search for: ");
                    ClearScreen.clear();
                    agenda.searchContact(nameSearch);
                    break;
                case 3:
                    // Modify a contact
                    String nameModify = Validator.getNonEmptyString("Enter the name of the contact to be modified: ");
                    ClearScreen.clear();
                    agenda.modifyContact(nameModify);
                    break;
                case 4:
                    // Delete a contact
                    System.out.println("Enter the name of the contact to delete: ");
                    String nameDelete = Validator.getNonEmptyString("Enter the name of the contact to delete: ");
                    ClearScreen.clear();
                    agenda.deleteContact(nameDelete);
                    break;
                case 5:
                    // Clear the agenda
                    agenda.showContacts();
                    break;
                case 6:
                    // Exit the program
                    agenda.clearAgenda();
                    break;
                case 7:
                    // Invalid option
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        System.out.println("Thank you for using our service.");
    }

}
