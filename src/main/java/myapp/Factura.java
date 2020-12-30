package myapp;

public class Factura {
	private int id_factura, IVA, Monto_Total;
	private String RUC, Razon_Social, Timbrado, Fecha_Emision, Fecha_Vencimiento,Estado,Tipo_Pago;
	
	public Factura() {
		super();
		
	}
	public Factura(int id_factura, int iVA, int monto_Total, String rUC, String razon_Social, String timbrado,
			String fecha_Emision, String fecha_Vencimiento, String estado, String tipo_Pago) {
		super();
		this.id_factura = id_factura;
		IVA = iVA;
		Monto_Total = monto_Total;
		RUC = rUC;
		Razon_Social = razon_Social;
		Timbrado = timbrado;
		Fecha_Emision = fecha_Emision;
		Fecha_Vencimiento = fecha_Vencimiento;
		Estado = estado;
		Tipo_Pago = tipo_Pago;
	}
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public int getIVA() {
		return IVA;
	}
	public void setIVA(int iVA) {
		IVA = iVA;
	}
	public int getMonto_Total() {
		return Monto_Total;
	}
	public void setMonto_Total(int monto_Total) {
		Monto_Total = monto_Total;
	}
	public String getRUC() {
		return RUC;
	}
	public void setRUC(String rUC) {
		RUC = rUC;
	}
	public String getRazon_Social() {
		return Razon_Social;
	}
	public void setRazon_Social(String razon_Social) {
		Razon_Social = razon_Social;
	}
	public String getTimbrado() {
		return Timbrado;
	}
	public void setTimbrado(String timbrado) {
		Timbrado = timbrado;
	}
	public String getFecha_Emision() {
		return Fecha_Emision;
	}
	public void setFecha_Emision(String fecha_Emision) {
		Fecha_Emision = fecha_Emision;
	}
	public String getFecha_Vencimiento() {
		return Fecha_Vencimiento;
	}
	public void setFecha_Vencimiento(String fecha_Vencimiento) {
		Fecha_Vencimiento = fecha_Vencimiento;
	}
	
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getTipo_Pago() {
		return Tipo_Pago;
	}
	public void setTipo_Pago(String tipo_Pago) {
		Tipo_Pago = tipo_Pago;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Estado == null) ? 0 : Estado.hashCode());
		result = prime * result + ((Fecha_Emision == null) ? 0 : Fecha_Emision.hashCode());
		result = prime * result + ((Fecha_Vencimiento == null) ? 0 : Fecha_Vencimiento.hashCode());
		result = prime * result + IVA;
		result = prime * result + Monto_Total;
		result = prime * result + ((RUC == null) ? 0 : RUC.hashCode());
		result = prime * result + ((Razon_Social == null) ? 0 : Razon_Social.hashCode());
		result = prime * result + ((Timbrado == null) ? 0 : Timbrado.hashCode());
		result = prime * result + ((Tipo_Pago == null) ? 0 : Tipo_Pago.hashCode());
		result = prime * result + id_factura;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (Estado == null) {
			if (other.Estado != null)
				return false;
		} else if (!Estado.equals(other.Estado))
			return false;
		if (Fecha_Emision == null) {
			if (other.Fecha_Emision != null)
				return false;
		} else if (!Fecha_Emision.equals(other.Fecha_Emision))
			return false;
		if (Fecha_Vencimiento == null) {
			if (other.Fecha_Vencimiento != null)
				return false;
		} else if (!Fecha_Vencimiento.equals(other.Fecha_Vencimiento))
			return false;
		if (IVA != other.IVA)
			return false;
		if (Monto_Total != other.Monto_Total)
			return false;
		if (RUC == null) {
			if (other.RUC != null)
				return false;
		} else if (!RUC.equals(other.RUC))
			return false;
		if (Razon_Social == null) {
			if (other.Razon_Social != null)
				return false;
		} else if (!Razon_Social.equals(other.Razon_Social))
			return false;
		if (Timbrado == null) {
			if (other.Timbrado != null)
				return false;
		} else if (!Timbrado.equals(other.Timbrado))
			return false;
		if (Tipo_Pago == null) {
			if (other.Tipo_Pago != null)
				return false;
		} else if (!Tipo_Pago.equals(other.Tipo_Pago))
			return false;
		if (id_factura != other.id_factura)
			return false;
		return true;
	}


}
