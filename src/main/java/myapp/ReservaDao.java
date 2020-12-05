package myapp;

import java.util.*;

import com.google.common.collect.ImmutableList;

public class ReservaDao {

    private final List<reserva> reservas = ImmutableList.of(
            new reserva("01", "Caacupe", "01/01/2020", "5", "500.000"),
            new reserva("02", "Sapucai", "01/01/2020", "5", "500.000"),
            new reserva("03", "Ypane", "01/01/2020", "5", "500.000"),
            new reserva("04", "San Bernardino", "01/01/2020", "5", "500.000"),
            new reserva("05", "Encarnación", "01/01/2020", "5", "500.000"),
            new reserva("06", "Ciudad del Este", "01/01/2020", "5", "500.000"),
            new reserva("07", "Villarica", "01/01/2020", "5", "500.000"),
            new reserva("08", "Ybycui", "01/01/2020", "5", "500.000")
    );

    public Iterable<reserva> getAllreservas() {
        return reservas;
    }



}
