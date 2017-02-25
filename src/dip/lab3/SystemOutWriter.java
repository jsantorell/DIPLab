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
public class SystemOutWriter extends Writer{

    public SystemOutWriter(Writer writer) {
        super(writer);
    }

    @Override
    public void Write() {
        System.out.println(MessageCache.getMessage());
        
    }
    
}
