package EvaluacionModelo;

public class Pagos {

	private int idpago;
	private int mensualidad;
    private int montoadicional;
	private String morosidad;
	private int clienteid;
	/**
	 * @param idpago
	 * @param mensualidad
	 * @param montoadicional
	 * @param morosidad
	 * @param clienteid
	 */
	public Pagos(int idpago, int mensualidad, int montoadicional, String morosidad, int clienteid) {
		super();
		this.idpago = idpago;
		this.mensualidad = mensualidad;
		this.montoadicional = montoadicional;
		this.morosidad = morosidad;
		this.clienteid = clienteid;
	}
	public int getIdpago() {
		return idpago;
	}
	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}
	public int getMensualidad() {
		return mensualidad;
	}
	public void setMensualidad(int mensualidad) {
		this.mensualidad = mensualidad;
	}
	public int getMontoadicional() {
		return montoadicional;
	}
	public void setMontoadicional(int montoadicional) {
		this.montoadicional = montoadicional;
	}
	public String getMorosidad() {
		return morosidad;
	}
	public void setMorosidad(String morosidad) {
		this.morosidad = morosidad;
	}
	public int getClienteid() {
		return clienteid;
	}
	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	@Override
	public String toString() {
		return "Pagos [idpago=" + idpago + ", mensualidad=" + mensualidad + ", montoadicional=" + montoadicional
				+ ", morosidad=" + morosidad + ", clienteid=" + clienteid + ", getIdpago()=" + getIdpago()
				+ ", getMensualidad()=" + getMensualidad() + ", getMontoadicional()=" + getMontoadicional()
				+ ", getMorosidad()=" + getMorosidad() + ", getClienteid()=" + getClienteid() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
