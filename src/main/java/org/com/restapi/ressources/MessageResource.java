package org.com.restapi.ressources;

import org.com.restapi.Bundle.MessageBeanParam;
import org.com.restapi.model.Message;
import org.com.restapi.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
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
    public List<Message> getMessages(@BeanParam MessageBeanParam beanParam) {
        //JUST FOR TEST
        if(beanParam.getYear() > 0)
            return  messageService.getAllMessagesForYear(beanParam.getYear());
        if(beanParam.getLimit() > 0 && beanParam.getOffset() >= 0)
            return  messageService.getAllMessagesPaginated(beanParam.getLimit(), beanParam.getOffset());
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
//    @POST
//    public Message addMessage(Message message) {
//        return messageService.addMessage(message);
//    }

    //Using Status code
    @POST
    public Response addMessage(Message message, @Context UriInfo uriInfo){
        Message newMessage = messageService.addMessage(message);
        String newId = String.valueOf(newMessage.getId());
        URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
        return Response.created(uri)
                .entity(newMessage)
                .build();
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

    /**
     * Implementing Subresources
     */

    @Path("/{messageId}/comments")
    public CommentResource getCommentResource(){
        return new CommentResource();
    }

}
