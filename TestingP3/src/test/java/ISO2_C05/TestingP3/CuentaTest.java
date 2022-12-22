package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testEncontrarCuenta() {
		int[] valoresEdad = {
				-10000, -1, 0,1 ,17, 18, 19, 24,25,26,199,200,201,10000
		};
		boolean[] valoresCasa = {true, false};
		
		boolean[] valoresEstudiante= { true, false};
		
		//agregar un test para valores null
		
	    for(int i=0; i<valoresEdad.length;i++) {
	        for(int j=0;j<valoresCasa.length;j++) {
	            for(int k=0; k<valoresEstudiante.length;k++) {
	                String expectedResult = getExpectedResult(valoresEdad[i], valoresCasa[j], valoresEstudiante[k]);
	                problema.Persona p = new problema.Persona(valoresEdad[i], valoresCasa[j], valoresEstudiante[k]);
	                String actualResult = problema.Main.encontrarCuenta(p);
	                assertEquals("Incorrect result for edad=" + valoresEdad[i] + ", casa=" + valoresCasa[j] + ", estudiante=" + valoresEstudiante[k], expectedResult, actualResult);
	            }
	        }
	    }
	}
	private String getExpectedResult(int edad, boolean casa, boolean estudiante) {
		if(edad<18 && estudiante && casa) {
			
			return "Cuenta Confort";
		}else if(edad< 25 && estudiante && !casa) {
		
			return "Cuenta Vamos que tú puedes";
		}else if(edad>18 && edad< 25 && !estudiante && casa) {
			
			return "Cuenta Saltando del Nido";
		}else if(edad > 25 && !estudiante && casa) {
			
			return "Cuenta Independizate que va siendo hora";
		}else if(edad > 25 && !estudiante && !casa) {
			
			return "Cuenta Bienvenido a la Vida Adulta";
		}else {
			return "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?";
			
		}
	}

	

}
