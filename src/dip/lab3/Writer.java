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
public abstract class Writer {

    private Writer writer;

    public Writer(Writer writer) {
        this.writer = writer;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public abstract void Write();


}
