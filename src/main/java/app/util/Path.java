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
        @Getter public static final String CREARFACTURA = "/factura/:id/crear";
        @Getter public static final String ELIMINARFACTURA = "/factura/:id/eliminar";
        @Getter public static final String CONSULTARFACTURA = "/factura/:id/consultar";
        @Getter public static final String MODIFICARFACTURA = "/factura/:id/modificar";
        @Getter public static final String CREARPAGO = "/pago/:id/crear";
        @Getter public static final String ELIMINARPAGO = "/pago/:id/eliminar";
        @Getter public static final String CONSULTARPAGO = "/pago/:id/consultar";
        @Getter public static final String MODIFICARPAGO = "/pago/:id/modificar";
    }

    public static class Template {
        public final static String INDEX = "/velocity/index/index.vm";
        public final static String LOGIN = "/velocity/login/login.vm";
        public static final String NOT_FOUND = "/velocity/notFound.vm";
        public static final String CONSULTARHOSPEDAJES = "/velocity/hospedajes/all.vm";
        public static final String MODIFICARHOSPEDAJE = "/velocity/hospedajes/modificarHospedaje.vm";
        public static final String ELIMINARHOSPEDAJE = "/velocity/hospedajes/eliminarHospedaje.vm";
        public final static String CONSULTARRESERVAS = "/velocity/reservas/consultarReservas.vm";
        public static final String CREARRESERVA = "/velocity/reservas/crearReserva.vm";
        public static final String MODIFICARRESERVA = "/velocity/hospedajes/modificarReserva.vm";
        public static final String ELIMINARRESERVA = "/velocity/hospedajes/eliminarReserva.vm";
        public static final String CREARFACTURA = "/velocity/factura/crearFactura.vm";
        public static final String ELIMINARFACTURA = "/velocity/factura/eliminarFactura.vm";
        public static final String CONSULTARFACTURA = "/velocity/factura/consultarFactura.vm";
        public static final String MODIFICARFACTURA = "/velocity/factura/modificarFactura.vm";
        public static final String CREARPAGO = "/velocity/pago/crearFactura.vm";
        public static final String ELIMINARPAGO = "/velocity/pago/eliminarFactura.vm";
        public static final String CONSULTARPAGO = "/velocity/pago/consultarFactura.vm";
        public static final String MODIFICARPAGO = "/velocity/pago/modificarFactura.vm";
    }

}
