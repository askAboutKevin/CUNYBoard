package resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dao.entity.Class;
import dao.entity.Student;
import service.classes.ClassServiceImpl;


@Path("/class")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClassResource {

	private ClassServiceImpl classservice;

	public ClassResource(ClassServiceImpl classservice) {
		super();
		this.classservice = classservice;
	}
	
	@GET
	public Response getEnrolledClasses(@QueryParam("empl") String emplID) {

		List<Class> classes = this.classservice.getClassEnrolledTo(emplID);
		
		return Response
				.status(Status.OK)
				.entity(classes)
				.build();
		}
	
	
	@GET
	@Path("/{section}")
	public Response findStudent(@PathParam("section") String section) {
		
		List<Student> students = this.classservice.getStudentsInClass(section);
		
		return Response
				.status(Status.OK)
				.entity(students)
				.build();
	}
	
	
}
