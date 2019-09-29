package resources;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Path("/twilio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TwilioResource {

	public static final String ACCOUNT_SID = "AC97aa30b3d0b88df9fc500c3d25702457";
    public static final String AUTH_TOKEN = "fintyv-rejxab-sucJe9";
    
	public TwilioResource() {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	}

	@GET
	@Path("/cancel")
	public static void classCancelled(@QueryParam("section") String section) {
		String message = "Your class " + section + " has been cancelled today";
		
		Message send = Message.creator(new PhoneNumber("+19177088589"),
		        new PhoneNumber("+15017250604"), 
		        message).create();
	}
	
	@GET
	@Path("/changed")
	public static void roomChanged(@QueryParam("section") String section, String newRoom) {
		String message = "Your classroom for " + section + " has been changed to " + newRoom + " today";
		
		Message send = Message.creator(new PhoneNumber("+19177088589"),
		        new PhoneNumber("+15017250604"), 
		        message).create();
	}
	
	@GET
	@Path("/emergency")
	public static void emergency(@QueryParam("section") String section) {
		String message = "There is an emergency in this class " + section + " today";
		
		Message send = Message.creator(new PhoneNumber("+19177088589"),
		        new PhoneNumber("+15017250604"), 
		        message).create();
	}
	
	@GET
	@Path("/delay")
	public static void delayed(@QueryParam("section") String section) {
		String message = "Your class " + section + " is going to start late today";
		
		Message send = Message.creator(new PhoneNumber("+19177088589"),
		        new PhoneNumber("+15017250604"), 
		        message).create();
	}
}
