/**
 * Main application class.
 */

package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

  /**
   * Renders the app with default string "Your new application is ready".
   *
   * @return Result
   */
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
