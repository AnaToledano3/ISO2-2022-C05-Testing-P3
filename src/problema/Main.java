package problema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		boolean estud,casapadres;
		Scanner scanner= new Scanner(System.in);
		while(true){
			try {
				System.out.println("Introduzca su edad");
				edad=scanner.nextInt();
				if (edad>0 && edad<200) {
					break;
				}else {
					System.out.println("Valor erroneo, vuelva a intentarlo");
				}
			}catch(Exception e) {
				System.out.println("Valor erroneo, vuelva a intentarlo");
				scanner.next();
			}
		}
		String opcion;
		while(true){
			try {
				System.out.println("¿Vives con tus padres? Escribe 's' para si o 'n' para no");
				opcion=scanner.next();
				if (opcion.contains("s")) {
					casapadres=true;
					break;
				}else if(opcion.contains("n")){
					casapadres=false;
					break;
				}else {
					System.out.println("Valor erroneo, vuelva a intentarlo");
					scanner.next();
				}
			}catch(Exception e) {
				System.out.println("Valor erroneo, vuelva a intentarlo");
				scanner.next();
			}
		}
		
		while(true){
			try {
				System.out.println("¿Eres estudiante? Escribe 's' para si o 'n' para no");
				opcion=scanner.next();
				if (opcion.contains("s")) {
					estud=true;
					break;
				}else if(opcion.contains("n")){
					estud=false;
					break;
				}else {
					System.out.println("Valor erroneo, vuelva a intentarlo");
					scanner.next();
				}
			}catch(Exception e) {
				System.out.println("Valor erroneo, vuelva a intentarlo");
				scanner.next();
			}
		}
		
		
		scanner.close();
		
		String tipoCuenta;
		Persona persona= new Persona(edad, casapadres, estud);
		tipoCuenta = encontrarCuenta(persona);
		System.out.println("Podemos ofrecerte: " + tipoCuenta);
	}
	
	public static String encontrarCuenta(Persona persona) {
		String cuenta;
		if(persona.getEdad()<18 && persona.isEstudiante() && persona.isCasaPadres()) {
			cuenta="Cuenta Confort";
			return cuenta;
		}else if(persona.getEdad()< 25 && persona.isEstudiante() && !persona.isCasaPadres()) {
			cuenta= "Cuenta Vamos que tú puedes";
			return cuenta;
		}else if(persona.getEdad()>18 && !persona.isEstudiante() && persona.isCasaPadres()) {
			cuenta="Cuenta Saltando del Nido";
			return cuenta;
			
		}else if(persona.getEdad() > 25 && !persona.isEstudiante() && persona.isCasaPadres()) {
			cuenta="Cuenta Independizate que va siendo hora";
			return cuenta;
		}else if(persona.getEdad() > 25 && !persona.isEstudiante() && !persona.isCasaPadres()) {
			cuenta="Cuenta Bienvenido a la Vida Adulta";
			return cuenta;
		}else {
			cuenta = "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?";
			return cuenta;
		}
	}

}
