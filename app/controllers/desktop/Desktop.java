package controllers.desktop;

import play.mvc.Controller;
import play.mvc.Result;

public class Desktop extends Controller {
    
    public static Result index() {
        return ok(views.html.desktop.index.render("Hello Play Framework"));
    }
    
}
