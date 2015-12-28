package org.com.restapi.service;

import org.com.restapi.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LYES-PC on 28/12/2015.
 */
public class MessageService {

    public List<Message> getAllMessages(){

        Message message1 = new Message(1, "Hello", "Lyes");
        Message message2 = new Message(2, "World", "Saviola");
        Message message3 = new Message(3, "2016", "CHI");
        List<Message> list = new ArrayList<>();
        list.add(message1);
        list.add(message2);
        list.add(message3);
        return list;
    }
}
