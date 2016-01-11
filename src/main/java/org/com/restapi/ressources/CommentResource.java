package org.com.restapi.ressources;

import org.com.restapi.model.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Lyes CHIOUKH on 11/01/2016.
 */

@Path("/") //Optional
public class CommentResource {

    @GET
    @Path("/{commentId}")
    public String getComment(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId) {
        return "message ID : " + messageId + " | Comment ID : " + commentId;
    }

}
