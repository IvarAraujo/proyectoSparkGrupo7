package myapp;
import static spark.Spark.*;


import app.book.BookController;
import app.index.IndexController;
import app.login.LoginController;
import app.user.UserDao;
import app.util.Filters;
import app.util.Path;
import app.util.ViewUtil;

public class app {
	
    public static ReservaDao reservaDao;
    public static UserDao userDao;

	public static void main(String[] args) {

		reservaDao = new ReservaDao();
		userDao = new UserDao();

		// Configure Spark
		port(4567);
		staticFiles.location("/public");
		staticFiles.expireTime(600L);

		// Set up before-filters (called before each get/post)
		before("*", Filters.addTrailingSlashes);
		before("*", Filters.handleLocaleChange);

		// Set up routes
		get(Path.Web.INDEX, IndexController.serveIndexPage);
		get(Path.Web.CREARRESERVA, ReservaController.CrearReservas);
		get(Path.Web.ELIMINARRESERVA, ReservaController.EliminarReserva);
		get(Path.Web.CONSULTARRESERVAS, ReservaController.ConsultarReservas);
		get(Path.Web.MODIFICARRESERVA, ReservaController.ModificarReservas);
		get(Path.Web.INICIOSESION, LoginController.serveLoginPage);
		post(Path.Web.INICIOSESION, LoginController.handleLoginPost);
		post(Path.Web.FINSESION, LoginController.handleLogoutPost);
		get("*", ViewUtil.notFound);

		// Set up after-filters (called after each get/post)
		after("*", Filters.addGzipHeader);

	}

}
