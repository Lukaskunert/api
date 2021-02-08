package cz.educanet.webik;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Produces(MediaType.APPLICATION_JSON)
    @Path("nevim")
    public class Resource {

        @Inject
        private Manager manager;


    @GET
    public Response getAll() {

        return Response.ok(manager.getHry()).build();

    }

    @GET

        @Path("{idco}")
        public Response getHra(@PathParam("idco") int idco) {

            return  Response.ok(manager.getHra(idco)).build();

        }

        @POST
        public Response createHra(Hra hra){
            if(!manager.create(hra))
                return Response.status(400).build();
            return Response.ok(hra).build();
        }

    @PUT

        @Path("{id}")
        public Response editHra(@PathParam("id") int id, Hra hra) {



        }

    @DELETE

        @Path("{idco}")
        public Response deleteHra(@PathParam("idco") int idco) {
            if(manager.removeHra(idco)){

            } else {
                return Response.status(Response.Status.BAD_REQUEST).build();
            }
        }

    }
