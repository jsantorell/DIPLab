/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import static dip.lab3.MessageCache.MessageCache; //Stores the message
import java.util.Scanner;

/**
 *
 * @author jerem
 */
public final class SystemOutReader implements Reader {



    public SystemOutReader(Reader reader) {
   

    }

    @Override
    public void read() {
        Scanner k = new Scanner(System.in);
        System.out.println("enter message here:");
        String message = k.nextLine();
        MessageCache(message);
    }


}
