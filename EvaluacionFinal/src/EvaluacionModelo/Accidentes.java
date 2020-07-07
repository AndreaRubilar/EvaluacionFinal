package EvaluacionModelo;

public class Accidentes {

private int idaccidentes;
private String fecha;
private String hora;
private String lugar;
private String detalle;
private int clienteid;
/**
 * @param idaccidentes
 * @param fecha
 * @param hora
 * @param lugar
 * @param detalle
 * @param clienteid
 */
public Accidentes(int idaccidentes, String fecha, String hora, String lugar, String detalle, int clienteid) {
	super();
	this.idaccidentes = idaccidentes;
	this.fecha = fecha;
	this.hora = hora;
	this.lugar = lugar;
	this.detalle = detalle;
	this.clienteid = clienteid;
}
public int getIdaccidentes() {
	return idaccidentes;
}
public void setIdaccidentes(int idaccidentes) {
	this.idaccidentes = idaccidentes;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getHora() {
	return hora;
}
public void setHora(String hora) {
	this.hora = hora;
}
public String getLugar() {
	return lugar;
}
public void setLugar(String lugar) {
	this.lugar = lugar;
}
public String getDetalle() {
	return detalle;
}
public void setDetalle(String detalle) {
	this.detalle = detalle;
}
public int getClienteid() {
	return clienteid;
}
public void setClienteid(int clienteid) {
	this.clienteid = clienteid;
}
@Override
public String toString() {
	return "Accidentes [idaccidentes=" + idaccidentes + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar
			+ ", detalle=" + detalle + ", clienteid=" + clienteid + ", getIdaccidentes()=" + getIdaccidentes()
			+ ", getFecha()=" + getFecha() + ", getHora()=" + getHora() + ", getLugar()=" + getLugar()
			+ ", getDetalle()=" + getDetalle() + ", getClienteid()=" + getClienteid() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}