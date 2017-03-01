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
public final class SystemOutWriter implements Writer {

    @Override
    public void write() {
        System.out.println(MessageCache.getMessage());

    }
//KEEP THIS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//    public void write(Reader r) {//this is an option to write a message without the message cache
//        System.out.println(r.getMessage());
//    }
//KEEP THIS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}
