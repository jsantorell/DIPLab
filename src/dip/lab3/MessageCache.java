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
public class MessageCache {
    
    private static String message;

    public static void MessageCache(String message) {
        MessageCache.message = message;
    }

    public static String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        MessageCache.message = message;
    }
    
    
    
}
