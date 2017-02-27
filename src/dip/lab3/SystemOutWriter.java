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

    private Writer writer;
    
    public SystemOutWriter(Writer writer) {
        setWriter(writer);
    }

    @Override
    public void Write() {
        System.out.println(MessageCache.getMessage());

    }

    @Override
    public Writer getWriter() {
 return writer;    }

    @Override
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

}


