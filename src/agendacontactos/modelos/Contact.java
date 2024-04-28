/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos.modelos;

/**
 *
 * @author Ezequiel
 */
/**
 * Represents a contact with a name and a phone number.
 */
public class Contact {

    private String name; // Name of the contact
    private String phone; // Phone number of the contact

    /**
     * Constructs a Contact object with the specified name and phone number.
     *
     * @param name the name of the contact.
     * @param phone the phone number of the contact.
     */
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    /**
     * Gets the name of the contact.
     *
     * @return the name of the contact.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the contact.
     *
     * @param name the new name of the contact.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the phone number of the contact.
     *
     * @return the phone number of the contact.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the contact.
     *
     * @param phone the new phone number of the contact.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns a string representation of the Contact object.
     *
     * @return a string representation of the Contact object.
     */
    @Override
    public String toString() {
        return "Contact{"
                + "name='" + name + '\''
                + ", phone='" + phone + '\''
                + '}';
    }
}
