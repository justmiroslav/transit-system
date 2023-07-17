package org.kse.demo.ts.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("main")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MainController {

    public static final String helloWorld = "Hello world!!!";

    @GET
    @Path("helloWorld")
    public Response getHelloWorld() {
        return Response
                .accepted(helloWorld)
                .build();
    }
}
