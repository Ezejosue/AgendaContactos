/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos.modelos;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
/**
 * Represents an agenda for managing contacts.
 */
public class Agenda {

    private static final int MAX_CONTACTS = 10; // Maximum number of contacts
    private Contact[] contacts; // Array to store contacts
    private int numContacts; // Number of contacts in the agenda
    private Scanner scanner = new Scanner(System.in); // Scanner object for user input

    /**
     * Constructs an Agenda object with an empty list of contacts.
     */
    public Agenda() {
        contacts = new Contact[MAX_CONTACTS];
        numContacts = 0;
    }

    /**
     * Adds a new contact to the agenda.
     *
     * @param newContact the contact to be added.
     */
    public void addContact(Contact newContact) {
        if (numContacts < MAX_CONTACTS) {
            boolean exists = false;
            for (int i = 0; i < numContacts; i++) {
                if (contacts[i].getName().equalsIgnoreCase(newContact.getName())) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                contacts[numContacts++] = newContact;
                System.out.println("Contact added successfully.");
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
            } else {
                System.out.println("The contact already exists.");
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
            }
        } else {
            System.out.println("The agenda is full.");
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }
    }

    /**
     * Searches for a contact in the agenda by name.
     *
     * @param name the name of the contact to search for.
     */
    public void searchContact(String name) {
        boolean found = false;
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Name: " + contacts[i].getName()
                        + ", Phone: " + contacts[i].getPhone());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Modifies a contact in the agenda by name.
     *
     * @param name the name of the contact to modify.
     */
    public void modifyContact(String name) {
        boolean found = false;

        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Do you want to modify this contact? (y/n)");
                String modifyChoice = scanner.nextLine().trim().toLowerCase();

                if (modifyChoice.equals("y")) {
                    System.out.println("Enter the new name (press Enter to keep the current one): ");
                    String newName = scanner.nextLine().trim();
                    if (!newName.isEmpty()) {
                        contacts[i].setName(newName);
                    }

                    System.out.println("Enter the new phone (press Enter to keep the current one): ");
                    String newTelephone = scanner.nextLine().trim();
                    if (!newTelephone.isEmpty()) {
                        contacts[i].setPhone(newTelephone);
                    }

                    System.out.println("Contact modified correctly.");
                } else {
                    System.out.println("Contact not modified.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Deletes a contact from the agenda by name.
     *
     * @param name the name of the contact to delete.
     */
    public void deleteContact(String name) {
        boolean found = false;
        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Are you sure you want to delete this contact? (y/n)");
                String deleteChoice = scanner.nextLine().trim().toLowerCase();

                if (deleteChoice.equals("y")) {
                    for (int j = i; j < numContacts - 1; j++) {
                        contacts[j] = contacts[j + 1];
                    }
                    numContacts--;
                    System.out.println("Contact removed correctly.");
                } else {
                    System.out.println("Contact not removed.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }

        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Displays all contacts in the agenda.
     */
    public void showContacts() {
        if (numContacts == 0) {
            System.out.println("Empty agenda");
        } else {
            for (int i = 0; i < numContacts; i++) {
                System.out.println("Name: " + contacts[i].getName()
                        + ", Phone: " + contacts[i].getPhone());
            }
        }
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Clears all contacts from the agenda.
     */
    public void clearAgenda() {
        System.out.print("Are you sure you want to clear the agenda (y/n): ");
        String clearChoice = scanner.nextLine().trim().toLowerCase();
        if (clearChoice.equals("y")) {
            contacts = new Contact[MAX_CONTACTS];
            numContacts = 0;
            System.out.println("Agenda is correctly emptied.");
        } else {
            System.out.println("Operation cancelled.");
        }
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

}
