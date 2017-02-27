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
public abstract class Reader{
    
    private Reader reader;

    public Reader(Reader reader) {
        this.reader = reader;
    }  

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public abstract void Read();


    

    

}
