package myapp;

public class Hospedaje {

	private int id_hospedaje;
	private String nombre_hospedaje, local_hospedaje, nro_habitacion, tipo_habitacion;
	
	public Hospedaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId_hospedaje() {
		return id_hospedaje;
	}
	public void setId_hospedaje(int id_hospedaje) {
		this.id_hospedaje = id_hospedaje;
	}
	public String getNombre_hospedaje() {
		return nombre_hospedaje;
	}
	public void setNombre_hospedaje(String nombre_hospedaje) {
		this.nombre_hospedaje = nombre_hospedaje;
	}
	public String getLocal_hospedaje() {
		return local_hospedaje;
	}
	public void setLocal_hospedaje(String local_hospedaje) {
		this.local_hospedaje = local_hospedaje;
	}
	public String getNro_habitacion() {
		return nro_habitacion;
	}
	public void setNro_habitacion(String nro_habitacion) {
		this.nro_habitacion = nro_habitacion;
	}
	public String getTipo_habitacion() {
		return tipo_habitacion;
	}
	public void setTipo_habitacion(String tipo_habitacion) {
		this.tipo_habitacion = tipo_habitacion;
	}
	
	@Override
	public String toString() {
		return "Hospedaje [id_hospedaje=" + id_hospedaje + ", nombre_hospedaje=" + nombre_hospedaje
				+ ", local_hospedaje=" + local_hospedaje + ", nro_habitacion=" + nro_habitacion + ", tipo_habitacion="
				+ tipo_habitacion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_hospedaje;
		result = prime * result + ((local_hospedaje == null) ? 0 : local_hospedaje.hashCode());
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
		Hospedaje other = (Hospedaje) obj;
		if (id_hospedaje != other.id_hospedaje)
			return false;
		if (local_hospedaje == null) {
			if (other.local_hospedaje != null)
				return false;
		} else if (!local_hospedaje.equals(other.local_hospedaje))
			return false;
		return true;
	}
}
