package org.com.restapi.ressources;

import org.com.restapi.model.Message;
import org.com.restapi.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by LYES-PC on 28/12/2015.
 */

@Path("/messages")
public class MessageRessource {

    MessageService messageService = new MessageService();

    @GET
    @Produces("application/xml")
    public List<Message> getMessages() {
        return  messageService.getAllMessages();
    }
}
