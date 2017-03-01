/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author jerem
 */
public class MessagingSystem {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        Writer writer = null;
        Reader reader = null;

        Reader r = new JOptionReader(reader);
        Writer w = new JOptionWriter(writer);

        Reader sOR = new SystemOutReader(reader);
        Writer sOW = new SystemOutWriter(writer);

        //Different types of Readers and Writers^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        MessageService s = new MessageService(sOR, sOW);//Add whichever reader and writer you want.
          
        s.setMessage(); //These are seperate for potential to use in different locations.
        s.outputMessage();
 

    }
    
}
