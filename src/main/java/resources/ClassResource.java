package resources;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import service.classes.ClassService;


@Path("/class")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClassResource {

	private ClassService classservice;

	public ClassResource(ClassService classservice) {
		super();
		this.classservice = classservice;
	}
	
	@GET
	public Response getEnrolledClasses(@QueryParam("empl") Optional emplID) {
		return null;
	}
	
	@GET
	public Response findStudent(@QueryParam("empl") Optional emplID) {
		return null;
	}
	
	
}
