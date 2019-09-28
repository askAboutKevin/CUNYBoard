package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import service.student.StudentService;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

	private StudentService studentService;

	public StudentResource(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

}
