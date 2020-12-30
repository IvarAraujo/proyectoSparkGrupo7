package myapp;

import java.util.*;

import com.google.common.collect.ImmutableList;

public class ReservaDao {

    private final List<reserva> reservas = ImmutableList.of(
            new reserva("01", "Caacupe", "01/01/2020","500.000",5,"Reserva para 2 personas","T",true),
            new reserva("02", "Sapucai", "01/01/2020", "400.000",2,"Reserva individual","D",false),
            new reserva("03", "Ypane", "01/01/2020","200.000",3,"Reserva individual","T",false),
            new reserva("04", "San Bernardino", "01/01/2020", "100.000",1,"Reserva individual","D",true),
            new reserva("05", "Encarnación", "01/01/2020","600.000",2,"Reserva para 3 personas","P",false),
            new reserva("06", "Ciudad del Este", "01/01/2020", "600.000",2,"Reserva para 3 personas","P",true),
            new reserva("07", "Villarica", "01/01/2020", "800.000",2,"Reserva para 4 personas","D",false),
            new reserva("08", "Ybycui", "01/01/2020", "100.000",2,"Reserva individual","P",true)
    );

    public Iterable<reserva> getAllreservas() {
        return reservas;
    }



}
