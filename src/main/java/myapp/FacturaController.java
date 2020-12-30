package myapp;

import static app.util.RequestUtil.clientAcceptsHtml;

import java.util.HashMap;

import app.login.LoginController;
import app.util.Path;
import app.util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;



public class FacturaController {
	
    public static Route fetchCrearFactura = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.CREARFACTURA;
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
	
    public static Route fetchModificarFactura = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.MODIFICARFACTURA);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
    
    public static Route fetchEliminarFactura = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.ELIMINARFACTURA);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
    
    public static Route fetchConsultarFactura = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            return ViewUtil.render(request, model, Path.Template.CONSULTARFACTURA);
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
}
