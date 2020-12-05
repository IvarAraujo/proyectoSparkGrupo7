package myapp;

import static app.util.RequestUtil.clientAcceptsHtml;

import java.util.HashMap;

import app.login.LoginController;
import app.util.Path;
import app.util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;

public class HospedajeController {

    public static Route fetchModificarHospedaje = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.MODIFICARHOSPEDAJE);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
    
    public static Route fetchEliminarHospedaje = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.ELIMINARHOSPEDAJE);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
    
    public static Route fetchConsultarHospedaje = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.CONSULTARHOSPEDAJES);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
}

