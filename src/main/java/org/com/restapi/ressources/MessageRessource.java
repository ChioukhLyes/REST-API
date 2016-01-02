package org.com.restapi.ressources;

import org.com.restapi.model.Message;
import org.com.restapi.service.MessageService;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by LYES-PC on 28/12/2015.
 */
@Path("/messages")
public class MessageRessource {

    /**
     * The Message service.
     */
    MessageService messageService = new MessageService();

    /**
     * Gets messages.
     *
     * @return the messages
     */
    @GET
    @Produces("application/json")
    public List<Message> getMessages() {
        return  messageService.getAllMessages();
    }

    /**
     * Gets message.
     *
     * @param messageId the message id
     * @return the message
     */
    @GET
    @Path("/{messageId}")
    @Produces("application/json")
    public Message getMessage(@PathParam("messageId") long messageId){
        return messageService.getMesage(messageId);
    }

    /**
     * Add message message.
     *
     * @param message the message
     * @return the message
     */
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Message addMessage(Message message){
        return messageService.addMessage(message);
    }
}
