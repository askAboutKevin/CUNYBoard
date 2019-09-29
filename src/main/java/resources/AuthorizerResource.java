package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dao.entity.Authorized;
import service.authorizer.AuthorizerServiceImpl;


@Path("/authorize")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorizerResource {
	
	private AuthorizerServiceImpl authorizerService;

	public AuthorizerResource(AuthorizerServiceImpl authorizerService) {
		super();
		this.authorizerService = authorizerService;
	}
	
	@GET
	public Response authorizeUser(@QueryParam("uname") String username, @QueryParam("pw") String password) {
		Authorized user = authorizerService.authorize(username, password);
		if(user.getPassword() == password) {
			return Response
					.status(Status.OK)
					.entity(user)
					.build();		
		}
		return null;
	}
}

	
	

