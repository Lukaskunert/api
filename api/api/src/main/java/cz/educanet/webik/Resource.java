package cz.educanet.webik;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Produces(MediaType.APPLICATION_JSON)
@Path("nevim")
public class GameResource {

    @Inject
    private GameManager manager;


    @GET
    public Response getAll() {
        return Response.ok(manager.getGames()).build();
    }

    @GET
    @Path("{idco}")
    public Response getGame(@PathParam("idco") int id) {
        return  Response.ok(manager.getGame(id)).build();
    }

    @POST
    public Response createGame(Game game){
        if(!manager.create(game))
            return Response.status(400).build();
        return Response.ok(game).build();
    }

    @PUT

    @Path("{id}")
    public Response editGame(@PathParam("id") int id, Game game) {
        return Response.ok("hra gon").build();
    }

    @DELETE

    @Path("{idco}")
    public Response deleteGame(@PathParam("idco") int id) {
        if(manager.removeGame(id)){
            return Response.ok("hra gon").build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

}
