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

   private Reader reader;

    public JOptionReader(Reader reader) {
        setReader(reader);
    }

    @Override
    public void Read() {
        String message = JOptionPane.showInputDialog(null, "enter message here:");
        MessageCache(message);
    }

    @Override
    public Reader getReader() {
        return reader;
    }

    @Override
    public void setReader(Reader reader) {
        this.reader = reader;
    }

    



}
