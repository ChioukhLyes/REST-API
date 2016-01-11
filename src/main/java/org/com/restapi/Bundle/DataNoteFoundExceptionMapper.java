package org.com.restapi.Bundle;

import org.com.restapi.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by Lyes CHIOUKH on 11/01/2016.
 */

@Provider
public class DataNoteFoundExceptionMapper implements ExceptionMapper<DataNoteFoundException> {

    @Override
    public Response toResponse(DataNoteFoundException e) {
        ErrorMessage errorMessage = new ErrorMessage(404, e.getMessage(), "LINK");
        return Response.status(Response.Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }
}
