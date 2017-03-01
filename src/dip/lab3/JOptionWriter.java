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
public class JOptionWriter implements Writer {

    @Override
    public void write() {

        JOptionPane.showMessageDialog(null, MessageCache.getMessage());

    }

}
