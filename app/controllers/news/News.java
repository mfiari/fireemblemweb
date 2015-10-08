package controllers.news;

import play.mvc.Controller;
import play.mvc.Result;

public class News extends Controller {
    
    public static Result index() {
        return ok(views.html.news.index.render("Hello Play Framework"));
    }
    
}
