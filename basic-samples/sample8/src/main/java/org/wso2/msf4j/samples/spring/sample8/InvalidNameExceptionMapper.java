package org.wso2.msf4j.samples.spring.sample8;

import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

@Component
public class InvalidNameExceptionMapper implements ExceptionMapper<InvalidNameException> {
    @Override
    public Response toResponse(InvalidNameException exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(exception.getMessage()).build();
    }
}
