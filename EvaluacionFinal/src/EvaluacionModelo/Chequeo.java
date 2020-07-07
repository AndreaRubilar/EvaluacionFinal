package EvaluacionModelo;

public class Chequeo {

	private int idchequeo;
	private String estado;
	private String observaciones;
	private int visitaid;
	private int empleadoid;
	/**
	 * @param idchequeo
	 * @param estado
	 * @param observaciones
	 * @param visitaid
	 * @param empleadoid
	 */
	public Chequeo(int idchequeo, String estado, String observaciones, int visitaid, int empleadoid) {
		super();
		this.idchequeo = idchequeo;
		this.estado = estado;
		this.observaciones = observaciones;
		this.visitaid = visitaid;
		this.empleadoid = empleadoid;
	}
	public int getIdchequeo() {
		return idchequeo;
	}
	public void setIdchequeo(int idchequeo) {
		this.idchequeo = idchequeo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public int getVisitaid() {
		return visitaid;
	}
	public void setVisitaid(int visitaid) {
		this.visitaid = visitaid;
	}
	public int getEmpleadoid() {
		return empleadoid;
	}
	public void setEmpleadoid(int empleadoid) {
		this.empleadoid = empleadoid;
	}
	@Override
	public String toString() {
		return "Chequeo [idchequeo=" + idchequeo + ", estado=" + estado + ", observaciones=" + observaciones
				+ ", visitaid=" + visitaid + ", empleadoid=" + empleadoid + ", getIdchequeo()=" + getIdchequeo()
				+ ", getEstado()=" + getEstado() + ", getObservaciones()=" + getObservaciones() + ", getVisitaid()="
				+ getVisitaid() + ", getEmpleadoid()=" + getEmpleadoid() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}