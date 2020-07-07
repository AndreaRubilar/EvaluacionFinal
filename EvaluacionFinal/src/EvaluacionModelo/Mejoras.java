package EvaluacionModelo;

public class Mejoras {

	private int idmejoras;
	private String fecha;
	private String motivo;
	private String actividades;
	private String estado;
	private int clienteid;
	/**
	 * @param idmejoras
	 * @param fecha
	 * @param motivo
	 * @param actividades
	 * @param estado
	 * @param clienteid
	 */
	public Mejoras(int idmejoras, String fecha, String motivo, String actividades, String estado, int clienteid) {
		super();
		this.idmejoras = idmejoras;
		this.fecha = fecha;
		this.motivo = motivo;
		this.actividades = actividades;
		this.estado = estado;
		this.clienteid = clienteid;
	}
	public int getIdmejoras() {
		return idmejoras;
	}
	public void setIdmejoras(int idmejoras) {
		this.idmejoras = idmejoras;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getActividades() {
		return actividades;
	}
	public void setActividades(String actividades) {
		this.actividades = actividades;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getClienteid() {
		return clienteid;
	}
	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	@Override
	public String toString() {
		return "Mejoras [idmejoras=" + idmejoras + ", fecha=" + fecha + ", motivo=" + motivo + ", actividades="
				+ actividades + ", estado=" + estado + ", clienteid=" + clienteid + ", getIdmejoras()=" + getIdmejoras()
				+ ", getFecha()=" + getFecha() + ", getMotivo()=" + getMotivo() + ", getActividades()="
				+ getActividades() + ", getEstado()=" + getEstado() + ", getClienteid()=" + getClienteid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	


}
