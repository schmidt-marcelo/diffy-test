package diffy.rest;

import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

/**
 * Created by mschmidt on 11/21/15.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/user")
public class UserService {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("application/json")
    public UserMessage getClichedMessage() {
        // Return some cliched textual content
        return new UserMessage("Hello fake user");
    }

    @GET
    @Path("/name/{guid}")
    @Produces("application/json")
    public UserName nameFor(@PathParam("guid") String guid) {
        return new UserName(String.format("User %s name is Name", guid));
    }
}
