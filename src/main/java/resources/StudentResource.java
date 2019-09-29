package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dao.entity.Student;
import service.student.StudentServiceImpl;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

	private StudentServiceImpl studentService;

	public StudentResource(StudentServiceImpl studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GET
	public Response getStudent(@QueryParam("empl") String empl) {
		Student student = this.studentService.getStudentInfo(empl);
		
		return Response
				.status(Status.OK)
				.entity(student)
				.build();
	}

}
