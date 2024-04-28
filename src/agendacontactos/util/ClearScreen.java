/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos.util;

/**
 *
 * @author Ezequiel
 */
public class ClearScreen {

    /**
     * Clears the console screen.
     *
     * This method detects the operating system and clears the console screen
     * accordingly. For Windows, it uses the "cls" command, and for other
     * operating systems, it uses the "clear" command.
     *
     * @throws InterruptedException if the process is interrupted while waiting
     * for the screen to clear.
     */
    public static void clear() {
        String os = System.getProperty("os.name");
        try {
            if (os.contains("Windows")) {
                // Clears the console screen for Windows using "cls" command
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Clears the console screen for other operating systems using "clear" command
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Handles any exception that occurs during the process
            System.out.println("Error while cleaning the screen: " + e.getMessage());
        }
    }

}
