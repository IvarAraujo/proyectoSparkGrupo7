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
        @Getter public static final String CREARRESERVA = "/reservas/crearReserva";
        @Getter public static final String CONSULTARRESERVAS = "/reservas/:id/";
        @Getter public static final String MODIFICARRESERVA = "/hospedajes/:id/modificar";
        @Getter public static final String ELIMINARRESERVA = "/hospedajes/:id/eliminar";
        @Getter public static final String CONSULTARHOSPEDAJES = "/hospedajes/:id/";
        @Getter public static final String MODIFICARHOSPEDAJE = "/hospedajes/:id/modificar";
        @Getter public static final String ELIMINARHOSPEDAJE = "/hospedajes/:id/eliminar";
    }

    public static class Template {
        public final static String INDEX = "/velocity/index/index.vm";
        public final static String LOGIN = "/velocity/login/login.vm";
        public final static String CONSULTARRESERVAS = "/velocity/reservas/consultarReservas.vm";
        public static final String CREARRESERVA = "/velocity/reservas/crear.vm";
        public static final String NOT_FOUND = "/velocity/notFound.vm";
        public static final String CONSULTARHOSPEDAJES = "/velocity/hospedajes/all.vm";
        public static final String MODIFICARHOSPEDAJE = "/velocity/hospedajes/modificarHospedaje.vm";
        public static final String ELIMINARHOSPEDAJE = "/velocity/hospedajes/eliminarHospedaje.vm";
        public static final String MODIFICARRESERVA = "/velocity/hospedajes/modificarReserva.vm";
        public static final String ELIMINARRESERVA = "/velocity/hospedajes/eliminarReserva.vm";
    }

}
