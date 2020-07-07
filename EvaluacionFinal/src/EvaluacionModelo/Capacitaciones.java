package EvaluacionModelo;

public class Capacitaciones {

	private int idcapacitaciones;
	private String fecha;
	private String numeroasistentes;
	private int visitaid;
	private int empleadoid;
	/**
	 * @param idcapacitaciones
	 * @param fecha
	 * @param numeroasistentes
	 * @param visitaid
	 * @param empleadoid
	 */
	public Capacitaciones(int idcapacitaciones, String fecha, String numeroasistentes, int visitaid, int empleadoid) {
		super();
		this.idcapacitaciones = idcapacitaciones;
		this.fecha = fecha;
		this.numeroasistentes = numeroasistentes;
		this.visitaid = visitaid;
		this.empleadoid = empleadoid;
	}
	public int getIdcapacitaciones() {
		return idcapacitaciones;
	}
	public void setIdcapacitaciones(int idcapacitaciones) {
		this.idcapacitaciones = idcapacitaciones;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNumeroasistentes() {
		return numeroasistentes;
	}
	public void setNumeroasistentes(String numeroasistentes) {
		this.numeroasistentes = numeroasistentes;
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
		return "Capacitaciones [idcapacitaciones=" + idcapacitaciones + ", fecha=" + fecha + ", numeroasistentes="
				+ numeroasistentes + ", visitaid=" + visitaid + ", empleadoid=" + empleadoid
				+ ", getIdcapacitaciones()=" + getIdcapacitaciones() + ", getFecha()=" + getFecha()
				+ ", getNumeroasistentes()=" + getNumeroasistentes() + ", getVisitaid()=" + getVisitaid()
				+ ", getEmpleadoid()=" + getEmpleadoid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}