

public class Persona {
	 
	private int edad;
	private boolean casaPadres;
	private boolean estudiante;
	
	public Persona(int ed, boolean casa, boolean est) {
		this.setEdad(ed);
		this.setCasaPadres(casa);
		this.setEstudiante(est);
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasaPadres() {
		return casaPadres;
	}
	public void setCasaPadres(boolean casaPadres) {
		this.casaPadres = casaPadres;
	}
	public boolean isEstudiante() {
		return estudiante;
	}
	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}
	
}
