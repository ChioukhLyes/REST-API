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

    /**
     * Instantiates a new Message service.
     */
    public MessageService() {
        messages.put(1L, new Message(1, "Hello", "Lyes"));
        messages.put(2L, new Message(2, "World", "Saviola"));
    }

    /**
     * Get all messages list.
     *
     * @return the list
     */
    public List<Message> getAllMessages() {
        return new ArrayList<>(messages.values());
    }

    /**
     * Get mesage message.
     *
     * @param id the id
     * @return the message
     */
    public Message getMessage(long id) {
        return messages.get(id);
    }

    /**
     * Add message message.
     *
     * @param message the message
     * @return the message
     */
    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    /**
     * Update message message.
     *
     * @param message the message
     * @return the message
     */
    public Message updateMessage(Message message) {
        if (message.getId() <= 0) {
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }

    /**
     * Delete message message.
     *
     * @param id the id
     * @return the message
     */
    public Message deleteMessage(long id) {
        return messages.remove(id);
    }
}
