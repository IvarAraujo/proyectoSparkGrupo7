package app.util;

import lombok.Getter;

public class Path {

    // The @Getter methods are needed in order to access
    // the variables from Velocity Templates
    public static class Web {
        @Getter public static final String INDEX = "/index/";
        @Getter public static final String INICIOSESION = "/login/";
        @Getter public static final String FINSESION = "/logout/";
        @Getter public static final String RESERVA = "/reservas/";
        @Getter public static final String TODASRESERVAS = "/reservas/:id/";
    }

    public static class Template {
        public final static String INDEX = "/velocity/index/index.vm";
        public final static String LOGIN = "/velocity/login/login.vm";
        public final static String TODASRESERVAS = "/velocity/book/all.vm";
        public static final String RESERVA = "/velocity/book/one.vm";
        public static final String NOT_FOUND = "/velocity/notFound.vm";
    }

}
