package org.com.restapi.service;

import org.com.restapi.Bundle.DataNoteFoundException;
import org.com.restapi.Bundle.Database;
import org.com.restapi.model.Message;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Created by Lyes CHIOUKH on 28/12/2015.
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
     * Gets all messages for year.
     *
     * @param year the year
     * @return the all messages for year
     */
    public List<Message> getAllMessagesForYear(int year) {
        List<Message>  messageForYear = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (Message message : messages.values()){
            calendar.setTime(message.getCreated());
            System.out.println(message.getCreated());
            if(calendar.get(Calendar.YEAR) == year)
                messageForYear.add(message);
        }
        return messageForYear;
    }


    /**
     * Gets all messages paginated.
     *
     * @param limit  the limit
     * @param offset the offset
     * @return the all messages paginated
     */
    public List<Message> getAllMessagesPaginated(int limit, int offset) {
        List<Message> messagesPaginated = new ArrayList<>(messages.values());
        if (limit + offset > messages.size()) return new ArrayList<>();
        return messagesPaginated.subList(offset, offset + limit);
    }

    /**
     * Get mesage message.
     *
     * @param id the id
     * @return the message
     */
    public Message getMessage(long id) {
        Message message =  messages.get(id);
        if(message == null)
            throw new DataNoteFoundException("Message with id : "+id+" not found.");
        return message;
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
