package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class ApplicationForm extends Controller {

	public static Result index() {
		return ok(applcationForm.index.render("Your new application is ready."));
    }

}
