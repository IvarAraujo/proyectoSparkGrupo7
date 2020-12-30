package myapp;

public class pago extends Factura {
	private int id_pago, monto_pago;
	private String medio_pago;
	
	public pago(int id_pago, int monto_pago, String medio_pago) {
		super();
		this.id_pago = id_pago;
		this.monto_pago = monto_pago;
		this.medio_pago = medio_pago;
	}
	public pago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public pago(int id_factura, int iVA, int monto_Total, String rUC, String razon_Social, String timbrado,
			String fecha_Emision, String fecha_Vencimiento, String estado, String tipo_Pago) {
		super(id_factura, iVA, monto_Total, rUC, razon_Social, timbrado, fecha_Emision, fecha_Vencimiento, estado, tipo_Pago);
		// TODO Auto-generated constructor stub
	}
	public int getId_pago() {
		return id_pago;
	}
	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}
	public int getMonto_pago() {
		return monto_pago;
	}
	public void setMonto_pago(int monto_pago) {
		this.monto_pago = monto_pago;
	}
	public String getMedio_pago() {
		return medio_pago;
	}
	public void setMedio_pago(String medio_pago) {
		this.medio_pago = medio_pago;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id_pago;
		result = prime * result + ((medio_pago == null) ? 0 : medio_pago.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		pago other = (pago) obj;
		if (id_pago != other.id_pago)
			return false;
		if (medio_pago == null) {
			if (other.medio_pago != null)
				return false;
		} else if (!medio_pago.equals(other.medio_pago))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "pago [id_pago=" + id_pago + ", monto_pago=" + monto_pago + ", medio_pago=" + medio_pago + "]";
	}
}
