package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;

import service.authorizer.AuthorizerService;


@Path("/authorize")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorizerResource {
	
	private AuthorizerService authorizerService;

	public AuthorizerResource(AuthorizerService authorizerService) {
		super();
		this.authorizerService = authorizerService;
	}
	
	@GET
	public Response authorizeUser(@QueryParam("uname") String username, @QueryParam("pw") String password) {
		return null;
	}
}

	
	

