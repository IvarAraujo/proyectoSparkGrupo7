package myapp;

import static app.util.RequestUtil.clientAcceptsHtml;

import java.util.HashMap;

import app.login.LoginController;
import app.util.Path;
import app.util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;

public class pagoController {
    public static Route fetchModificarPago = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.MODIFICARPAGO);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
    
    public static Route fetchEliminarPago = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.ELIMINARPAGO);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
    
    public static Route fetchConsultarPago = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.CONSULTARPAGO);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
    
    public static Route fetchCrearPago = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.CREARPAGO);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
}
