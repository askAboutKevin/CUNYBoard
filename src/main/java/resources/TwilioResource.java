package resources;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import dao.ClassDAO;
import dao.entity.Student;
import service.classes.ClassServiceImpl;

@Path("/twilio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TwilioResource {
	
	private ClassServiceImpl classservice;
	
	private static final String ACCOUNT_SID = "AC97aa30b3d0b88df9fc500c3d25702457";
	private static final String AUTH_TOKEN = "fintyv-rejxab-sucJe9";
    
	public TwilioResource(ClassServiceImpl classservice) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		this.classservice = classservice;
	}

	@GET
	@Path("/cancel")
	public void classCancelled(@QueryParam("section") String section) {
		
		String message = "Your class " + section + " has been cancelled today";
		
		List<Student> students = this.classservice.getStudentsInClass(section);
			
		for (Student s : students) {
			Message send = Message.creator(new PhoneNumber("+19177088589"),
			        new PhoneNumber(s.getNumber()), 
			        message).create();
		}
		
	}
	
	@GET
	@Path("/changed")
	public void roomChanged(@QueryParam("section") String section, String newRoom) {
		String message = "Your classroom for " + section + " has been changed to " + newRoom + " today";
		
		List<Student> students = this.classservice.getStudentsInClass(section);

		for (Student s : students) {
			@SuppressWarnings("unused")
			Message send = Message.creator(new PhoneNumber("+19177088589"),
			        new PhoneNumber(s.getNumber()), 
			        message).create();
		}
	}
	
	@GET
	@Path("/emergency")
	public void emergency(@QueryParam("section") String section) {
		String message = "There is an emergency in this class " + section + " today";
		
		List<Student> students = this.classservice.getStudentsInClass(section);

		for (Student s : students) {
			Message send = Message.creator(new PhoneNumber("+19177088589"),
			        new PhoneNumber(s.getNumber()), 
			        message).create();
		}
	}
	
	@GET
	@Path("/delay")
	public void delayed(@QueryParam("section") String section) {
		String message = "Your class " + section + " is going to start late today";
	
		List<Student> students = this.classservice.getStudentsInClass(section);

		for (Student s : students) {
			Message send = Message.creator(new PhoneNumber("+19177088589"),
			        new PhoneNumber(s.getNumber()), 
			        message).create();
		}
	}
}
