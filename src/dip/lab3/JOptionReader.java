/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import static dip.lab3.MessageCache.MessageCache;
import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public final class JOptionReader implements Reader {

    @Override
    public void read() {

        String selectNumberofMessages = JOptionPane.showInputDialog(null, "How many messages would you like to add?");
        int sm = Integer.parseInt(selectNumberofMessages);
        for (int i = 0; sm > i; i++) {
            String message = JOptionPane.showInputDialog(null, "enter message here:");
            MessageCache(message);
        }
    }

}
