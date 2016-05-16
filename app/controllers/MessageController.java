package controllers;

import play.mvc.*;
import views.html.*;
import play.*;
import play.data.*;
import static play.data.Form.*;

import com.fasterxml.jackson.databind.JsonNode;

import akka.stream.impl.fusing.Map;
import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class  MessageController extends Controller {
	
	
	
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
        

	public Result getMessages() {
	    JsonNode json = request().body().asJson();
	    if(json == null) {
	        return badRequest("Expecting Json data");
	    } else {
	        String name = json.findPath("username").textValue();
	        String first = json.findPath("firstname").textValue();
	        String last = json.findPath("lastname").textValue();
	        String address = json.findPath("address").textValue();
	        if(name == null) {
	            return badRequest("Missing parameter [name]");
	        } 
	        else {
	        	System.out.println("username: " + name);
	        	System.out.println("firtname: " + first);
	        	System.out.println("lastname: " + last);
	        	System.out.println("address: " + address);
	            return ok("ok");
	        }
	    }
	    
	}

}
