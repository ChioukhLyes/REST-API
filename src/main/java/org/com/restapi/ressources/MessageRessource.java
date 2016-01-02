package org.com.restapi.ressources;

import org.com.restapi.model.Message;
import org.com.restapi.service.MessageService;
import org.eclipse.persistence.annotations.CascadeOnDelete;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by LYES-PC on 28/12/2015.
 */

@Path("/messages")
public class MessageRessource {

    MessageService messageService = new MessageService();

    @GET
    @Produces("application/json")
    public List<Message> getMessages() {
        return  messageService.getAllMessages();
    }

    @GET
    @Path("/{messageId}")
    @Produces("application/json")
    public Message getMessage(@PathParam("messageId") long messageId){
        return messageService.getMesage(messageId);
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Message addMessage(Message message){
        return messageService.addMessage(message);
    }



}
