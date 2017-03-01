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
    
    private Writer write;
    private Reader reader;
    
    public void setMessage(){

        reader.read();
    
    };
    public void outputMessage(){
        write.write();
    };

    public MessageService(Reader r, Writer w) {
        
       this.reader = r;
       this.write = w;
        
    }

    public Writer getWrite() {
        return write;
    }

    public void setWrite(Writer write) {
        this.write = write;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    
}
