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
public class JOptionWriter implements Writer{
    
    private Writer writer;
    
    public JOptionWriter(Writer writer) {
        setWriter(writer);
    }

    @Override
    public void Write() {
        
        JOptionPane.showMessageDialog(null, MessageCache.getMessage());
        
    }

    @Override
    public Writer getWriter() {
        return writer;
    }

    @Override
    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    
   
    
}
