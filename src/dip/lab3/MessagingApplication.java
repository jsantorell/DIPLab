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
public class MessagingApplication {

    public static void main(String[] args) {

//        Writer writer = null;
//        Reader reader = null;

        Reader r = new JOptionReader();
        Writer w = new JOptionWriter();

        Reader sOR = new SystemOutReader();
        Writer sOW = new SystemOutWriter();

        //Different types of Readers and Writers^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        MessageService s = new MessageService(sOR, sOW);//Add whichever reader and writer you want.
          
        s.produceMessage();
        
//        s.setMessage(); //These are seperate for potential to use in different locations.
//        s.outputMessage();
 

    }
    
}
