package controllers.online;

import play.mvc.Controller;
import play.mvc.Result;

public class Online extends Controller {
    
    public static Result index() {
        return ok(views.html.online.index.render("Hello Play Framework"));
    }
    
}
