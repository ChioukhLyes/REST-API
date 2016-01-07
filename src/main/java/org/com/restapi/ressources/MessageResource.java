package org.com.restapi.ressources;

import org.com.restapi.model.Message;
import org.com.restapi.service.MessageService;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by Lyes CHIOUKH on 28/12/2015.
 */
@Path("/messages")
@Produces("application/json")
@Consumes("application/json")
public class MessageResource {

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
    public List<Message> getMessages(@QueryParam("year") int year,
                                     @QueryParam("limit") int limit,
                                     @QueryParam("offset") int offset) {
        //JUST FOR TEST
        if(year > 0)
            return  messageService.getAllMessagesForYear(year);
        if(limit > 0 && offset >= 0)
            return  messageService.getAllMessagesPaginated(limit, offset);
        return messageService.getAllMessages();
    }

    /**
     * Gets message.
     *
     * @param messageId the message id
     * @return the message
     */
    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") long messageId) {
        return messageService.getMessage(messageId);
    }

    /**
     * Add message message.
     *
     * @param message the message
     * @return the message
     */
    @POST
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }

    /**
     * Update message message.
     *
     * @param message the message
     * @return the message
     */
    @PUT
    public Message updateMessage(Message message) {
        return messageService.updateMessage(message);
    }


    /**
     * Delete message message.
     *
     * @param messageId the message id
     * @return the message
     */
    @DELETE
    @Path("/{messageId}")
    public Message DELETEMessage(@PathParam("messageId") long messageId) {
        return messageService.deleteMessage(messageId);
    }
}
