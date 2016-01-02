package org.com.restapi.service;

import org.com.restapi.Bundle.Database;
import org.com.restapi.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by LYES-PC on 28/12/2015.
 */
public class MessageService {

    private Map<Long, Message> messages = Database.getMessages();

    public MessageService(){
        messages.put(1L, new Message(1, "Hello", "Lyes"));
        messages.put(2L, new Message(2, "Worl", "Saviola"));
    }

    public List<Message> getAllMessages(){
       return  new ArrayList<>(messages.values());
    }

    public Message getMesage(long id){
        return messages.get(id);
    }

    public Message addMessage(Message message){
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message){
        if(message.getId() <= 0){
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }

    public Message deleteMessage(long id){
        return messages.remove(id);
    }
}
