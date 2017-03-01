/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerem
 */
public class MessageCache {

 
    private static List<String> messages = new ArrayList<>(); 

    public static void MessageCache(String message) {
        messages.add(message);
    }

    public static String getMessage() {
        return "The message(s): " + messages;
    }


}
