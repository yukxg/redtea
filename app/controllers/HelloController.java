package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the page that prints hello world
 */
public class HelloController extends Controller {
	private final String hello = "Hello World!";
    
    public Result hello() {
        return ok(hello);
    }

}