package ISO2_C05.TestingP3;

public class Persona {
	 
	private int edad;
	private boolean casaPadres;
	private boolean estudiante;
	/**
	 * 
	 * @param ed
	 * @param casa
	 * @param est
	 */
	public Persona(int ed, boolean casa, boolean est) {
		this.setEdad(ed);
		this.setCasaPadres(casa);
		this.setEstudiante(est);
	}
/**
 * 
 * @return edad
 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return casaPadres
	 */
	public boolean isCasaPadres() {
		return casaPadres;
	}
	/**
	 * 
	 * @param casaPadres
	 */
	public void setCasaPadres(boolean casaPadres) {
		this.casaPadres = casaPadres;
	}
	/**
	 * 
	 * @return estudiante
	 */
	public boolean isEstudiante() {
		return estudiante;
	}
	/**
	 * 
	 * @param estudiante
	 */
	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}
	
}
