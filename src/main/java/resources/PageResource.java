package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_OCTET_STREAM)
public class PageResource {

	public PageResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	public Response welcome() {
		return null;
	}

}
