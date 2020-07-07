package EvaluacionModelo;

public class Empleado {

	private int idempleado;
	private String nombre;
	private String apellido;
	private String especialidad;
	/**
	 * @param idempleado
	 * @param nombre
	 * @param apellido
	 * @param especialidad
	 */
	public Empleado(int idempleado, String nombre, String apellido, String especialidad) {
		super();
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", especialidad=" + especialidad + ", getIdempleado()=" + getIdempleado() + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEspecialidad()=" + getEspecialidad()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	


}
