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
public class SystemOutReader extends Reader {

    public SystemOutReader(Reader reader) {
        super(reader);
    }

    @Override
    public void Read() {
        Scanner k = new Scanner(System.in);
        System.out.println("enter message here:");
        String message = k.nextLine();
        MessageCache(message);
    }
}
