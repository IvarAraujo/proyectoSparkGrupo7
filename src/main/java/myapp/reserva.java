package myapp;

public class reserva {
	String id_reserva, localidad, fecha_reserva, dias_reserva, costo_reserva;

	public reserva(String id_reserva, String localidad, String fecha_reserva, String dias_reserva,
			String costo_reserva) {
		super();
		this.id_reserva = id_reserva;
		this.localidad = localidad;
		this.fecha_reserva = fecha_reserva;
		this.dias_reserva = dias_reserva;
		this.costo_reserva = costo_reserva;
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

	public String getDias_reserva() {
		return dias_reserva;
	}

	public void setDias_reserva(String dias_reserva) {
		this.dias_reserva = dias_reserva;
	}

	public String getCosto_reserva() {
		return costo_reserva;
	}

	public void setCosto_reserva(String costo_reserva) {
		this.costo_reserva = costo_reserva;
	}

	@Override
	public String toString() {
		return "reserva [id_reserva=" + id_reserva + ", localidad=" + localidad + ", fecha_reserva=" + fecha_reserva
				+ ", dias_reserva=" + dias_reserva + ", costo_reserva=" + costo_reserva + "]";
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
