package myapp;

public class reserva {
	
		String id_reserva, localidad, fecha_reserva,costo_reserva;
		int dias_reserva;
		String detalles_reserva, medio_reserva;
		boolean reserva_vip;
	
	
	public reserva(String id_reserva, String localidad, String fecha_reserva, String costo_reserva, int dias_reserva,
			String detalles_reserva, String medio_reserva, boolean reserva_vip) {
		super();
		this.id_reserva = id_reserva;
		this.localidad = localidad;
		this.fecha_reserva = fecha_reserva;
		this.costo_reserva = costo_reserva;
		this.dias_reserva = dias_reserva;
		this.detalles_reserva = detalles_reserva;
		this.medio_reserva = medio_reserva;
		this.reserva_vip = reserva_vip;
	}

	public reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(String id_reserva) {
		this.id_reserva = id_reserva;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public int getDias_reserva() {
		return dias_reserva;
	}

	public void setDias_reserva(int dias_reserva) {
		this.dias_reserva = dias_reserva;
	}

	public String getCosto_reserva() {
		return costo_reserva;
	}

	public void setCosto_reserva(String costo_reserva) {
		this.costo_reserva = costo_reserva;
	}

	public String getDetalles_reserva() {
		return detalles_reserva;
	}

	public void setDetalles_reserva(String detalles_reserva) {
		this.detalles_reserva = detalles_reserva;
	}

	public String getMedio_reserva() {
		return medio_reserva;
	}

	public void setMedio_reserva(String medio_reserva) {
		this.medio_reserva = medio_reserva;
	}

	public boolean getReserva_vip() {
		return reserva_vip;
	}

	public void setReserva_vip(boolean reserva_vip) {
		this.reserva_vip = reserva_vip;
	}



	@Override
	public String toString() {
		return "reserva [id_reserva=" + id_reserva + ", localidad=" + localidad + ", fecha_reserva=" + fecha_reserva
				+ ", costo_reserva=" + costo_reserva + ", dias_reserva=" + dias_reserva + ", detalles_reserva="
				+ detalles_reserva + ", medio_reserva=" + medio_reserva + ", reserva_vip=" + reserva_vip + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha_reserva == null) ? 0 : fecha_reserva.hashCode());
		result = prime * result + ((id_reserva == null) ? 0 : id_reserva.hashCode());
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
		reserva other = (reserva) obj;
		if (fecha_reserva == null) {
			if (other.fecha_reserva != null)
				return false;
		} else if (!fecha_reserva.equals(other.fecha_reserva))
			return false;
		if (id_reserva == null) {
			if (other.id_reserva != null)
				return false;
		} else if (!id_reserva.equals(other.id_reserva))
			return false;
		return true;
	}
}
