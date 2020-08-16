package org.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/explorer")
public class Example {
//added comment
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "world";
    }
}