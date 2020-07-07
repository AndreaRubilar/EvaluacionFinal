package EvaluacionModelo;

public class Cliente {

	private int id;
	private String nombre;
	private int telefono;
	private String direccion;
	private String correoelectronico;
	private String rubro;
	/**
	 * @param idcliente
	 * @param nombre
	 * @param telefono
	 * @param direccion
	 * @param correoelectronico
	 * @param rubro
	 */
	public Cliente(int id, String nombre, int telefono, String direccion, String correoelectronico,
			String rubro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
	}
	public Cliente(String nombre2, int telefono2, String direccion2, String correo, String rubro2) {
		// TODO Auto-generated constructor stub
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion="
				+ direccion + ", correoelectronico=" + correoelectronico + ", rubro=" + rubro + ", getId()="
				+ getId() + ", getNombre()=" + getNombre() + ", getTelefono()=" + getTelefono()
				+ ", getDireccion()=" + getDireccion() + ", getCorreoelectronico()=" + getCorreoelectronico()
				+ ", getRubro()=" + getRubro() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getIdCliente() {
		// TODO Auto-generated method stub
		return null;
	}



}
