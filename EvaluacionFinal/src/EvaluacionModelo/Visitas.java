package EvaluacionModelo;

public class Visitas {
	
	private int idvisitas;
	private String direccion;
	private String ciudad;
	private String fecha;
	private String resumen;
	private int empleadoid;
	private int clienteid;
	/**
	 * @param idvisitas
	 * @param direccion
	 * @param ciudad
	 * @param fecha
	 * @param resumen
	 * @param empleadoid
	 * @param clienteid
	 */
	public Visitas(int idvisitas, String direccion, String ciudad, String fecha, String resumen, int empleadoid,
			int clienteid) {
		super();
		this.idvisitas = idvisitas;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.resumen = resumen;
		this.empleadoid = empleadoid;
		this.clienteid = clienteid;
	}
	public int getIdvisitas() {
		return idvisitas;
	}
	public void setIdvisitas(int idvisitas) {
		this.idvisitas = idvisitas;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public int getEmpleadoid() {
		return empleadoid;
	}
	public void setEmpleadoid(int empleadoid) {
		this.empleadoid = empleadoid;
	}
	public int getClienteid() {
		return clienteid;
	}
	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	@Override
	public String toString() {
		return "Visitas [idvisitas=" + idvisitas + ", direccion=" + direccion + ", ciudad=" + ciudad + ", fecha="
				+ fecha + ", resumen=" + resumen + ", empleadoid=" + empleadoid + ", clienteid=" + clienteid
				+ ", getIdvisitas()=" + getIdvisitas() + ", getDireccion()=" + getDireccion() + ", getCiudad()="
				+ getCiudad() + ", getFecha()=" + getFecha() + ", getResumen()=" + getResumen() + ", getEmpleadoid()="
				+ getEmpleadoid() + ", getClienteid()=" + getClienteid() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}




}
