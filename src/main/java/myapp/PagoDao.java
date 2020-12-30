package myapp;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class PagoDao {
    private final List<pago> pagos = ImmutableList.of(
            new pago(01, 50000, 500000,"3626498","IvarAraujo","001-001-74129","01-01-2021","05-01-2021","Activo","Credito"),
            new pago(01, 50000, 500000,"3626497","MarcosMeza","001-001-74100","01-01-2020","05-01-2020","Activo","Contado"),
            new pago(01, 50000, 500000,"689147","AngelAraujo","001-001-73224","01-01-2019","05-01-2019","Activo","Contado")
    );

    public Iterable<pago> getAllPagos() {
        return pagos;
    }
}
