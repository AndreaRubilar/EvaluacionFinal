package EvaluacionModelo;

public class Asesorias {

 private int idasesorias;
 private String propuesta;
 private String fecha;
 private String gestion;
 private int visitaid;
 private int empleadoid;
/**
 * @param idasesorias
 * @param propuesta
 * @param fecha
 * @param gestion
 * @param visitaid
 * @param empleadoid
 */
public Asesorias(int idasesorias, String propuesta, String fecha, String gestion, int visitaid, int empleadoid) {
	super();
	this.idasesorias = idasesorias;
	this.propuesta = propuesta;
	this.fecha = fecha;
	this.gestion = gestion;
	this.visitaid = visitaid;
	this.empleadoid = empleadoid;
}
public int getIdasesorias() {
	return idasesorias;
}
public void setIdasesorias(int idasesorias) {
	this.idasesorias = idasesorias;
}
public String getPropuesta() {
	return propuesta;
}
public void setPropuesta(String propuesta) {
	this.propuesta = propuesta;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getGestion() {
	return gestion;
}
public void setGestion(String gestion) {
	this.gestion = gestion;
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
	return "Asesorias [idasesorias=" + idasesorias + ", propuesta=" + propuesta + ", fecha=" + fecha + ", gestion="
			+ gestion + ", visitaid=" + visitaid + ", empleadoid=" + empleadoid + ", getIdasesorias()="
			+ getIdasesorias() + ", getPropuesta()=" + getPropuesta() + ", getFecha()=" + getFecha() + ", getGestion()="
			+ getGestion() + ", getVisitaid()=" + getVisitaid() + ", getEmpleadoid()=" + getEmpleadoid()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
 
 
 
}