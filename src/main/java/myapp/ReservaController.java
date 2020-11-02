package myapp;

import app.login.*;
import app.util.*;
import spark.*;
import java.util.*;
import static app.util.JsonUtil.*;
import static app.util.RequestUtil.*;

public class ReservaController {

    public static Route fetchAllBooks = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.BOOKS_ALL);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };

    public static Route fetchOneBook = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.BOOKS_ONE);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
}
