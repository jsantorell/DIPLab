/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public final class JOptionReader extends Reader {

   

    public JOptionReader(Reader reader) {
        super(reader);
    }

    @Override
    public void Read() {
        String message = JOptionPane.showInputDialog(null, "enter message here:");
        MessageCache(message);
    }

    



}
