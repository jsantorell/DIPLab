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
public final class MessageService {

    private Writer writer;
    private Reader reader;

    public void produceMessage() {//run the whole service together
        setMessage();
        outputMessage();
    }

    public void setMessage() {//only read the message
        reader.read();
    }

    public void outputMessage() {//only write the message
        writer.write();
    }

    public MessageService(Reader r, Writer w) {
        this.reader = r;
        this.writer = w;
    }

    public void setWrite(Writer write) {
        this.writer = write;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

}
