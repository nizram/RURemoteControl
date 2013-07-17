package projectorapp;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.Component;

/**
 * ErrorDialog Allows for the displaying of error messages via a JOptionPane.
 * 
 * This code was adapted from The TrajGUI project for Rowan University in 2005.
 * The contributers of the the original project are: Chris Clement,
 * Peter Flanner, Dan Marzin, Josh Ogren, and Andrew Tasso.
 * 
 * @author marzin
 * @version 0.1
 */

public class ErrorDialog
{

     private static JOptionPane errorOptionPane = 
            new JOptionPane();

    /**
     * Creates a new ErrorDialog
     */
    public ErrorDialog(){}

    /**
     * Displays a modal error dialog with a specified parent, title and 
     * an error message. 
     * 
     * @param parent the parent window for the dialog
     * @param error the error messages.
     * @param title The title of the error dialog
     */
    public static void display(Component parent, String title, String error)
    {
        
        //create the option pane
        errorOptionPane = new JOptionPane(error, JOptionPane.ERROR_MESSAGE);
        //create a dialog to hold the optionpane
        JDialog dialog = errorOptionPane.createDialog(parent, title);
        //set the dialog to modal
        dialog.setModal(true);
        //display the dialog
        dialog.setVisible(true);
                                          
    }      
    
    /**
     * Displays a modal error dialog with a specified parent, title and 
     * an array of messages. The array of Strings is displayed sequentially 
     * with one element per line in the error dialog.
     * 
     * @param parent the parent window calling the error dialog
     * @param error an array of error messages.
     * @param title The title of the error dialog
     */
    public static void display(Component parent, String title, String[] error)
    {
            
        //create the option pane
        errorOptionPane = new JOptionPane(error, JOptionPane.ERROR_MESSAGE);
        //create a dialog to hold the optionpane
        JDialog dialog = errorOptionPane.createDialog(parent, title);
        //set the dialog to modal
        dialog.setModal(true);
        //display the dialog
        dialog.setVisible(true);
                                          
    }  

}