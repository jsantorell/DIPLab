/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class ErrorManager {

    private static final String ERROR_MSG
            = "Cannot get annual wages because no valid employee type provided";
    private static final String ERROR_TITLE = "Employee Type Unknown";

    public static String getERROR_MSG() {
        return ERROR_MSG;
    }

    public static String getERROR_TITLE() {
        return ERROR_TITLE;
    }

    public static void errorSender() {

        JOptionPane.showMessageDialog(
                null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
    }

}
