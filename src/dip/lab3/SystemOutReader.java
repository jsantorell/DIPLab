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
        int count = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("How many messages would you like to add?");
        int sm = k.nextInt();
        for (int i = 0; i < sm; i++) {//Not sure why but i always have trouble with Scanner skipping nextLine in for loop.
            if (count < 1) {
                System.out.print("enter message here:");
                String message = k.nextLine();
                message = k.nextLine();//I always need to add this very dumb code to work around it.
                MessageCache(message);
                count++;
            } else {
                System.out.print("enter message here:");
                String message = k.nextLine();
                MessageCache(message);
            }
        }
    }

}
