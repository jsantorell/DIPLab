/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author jerem
 */
public class MessagingSystem {

    public static void main(String[] args) {

        Writer writer = null;
        Reader reader = null;

        Reader r = new JOptionReader(reader);
        Writer w = new JOptionWriter(writer);

        Reader sOR = new SystemOutReader(reader);
        Writer sOW = new SystemOutWriter(writer);

        //Different types of Readers and Writers^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        MessageService s = new MessageService(r, sOW);
        

        s.setMessage();
        s.outputMessage();

    }
}
