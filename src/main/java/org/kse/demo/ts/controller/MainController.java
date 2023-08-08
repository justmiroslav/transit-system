package org.kse.demo.ts.controller;

import org.kse.demo.ts.dao.CityDao;
import org.kse.demo.ts.entity.City;
import org.kse.demo.ts.service.CityService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("main")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MainController {

    public static final String helloWorld = "Hello world!!!";
    @Inject
    CityService service;
    @GET
    @Path("helloWorld")
    public Response getHelloWorld() {
        return Response
                .accepted(helloWorld)
                .build();
    }

    @POST
    @Path("city")
    public Response postCity(@QueryParam("name") String name){
        City city = service.createCity(name);
        return Response
                .ok(city)
                .build();
    }
}
