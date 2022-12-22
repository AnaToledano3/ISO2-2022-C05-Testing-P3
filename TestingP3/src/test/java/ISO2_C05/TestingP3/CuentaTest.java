

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void CDP1() {
		
		Persona per= new Persona(20, false, false);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP2() {
		
		Persona per= new Persona(16, false, false);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP3() {
		
		Persona per= new Persona(16, false, true);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Vamos que tú puedes");
	   
	}
	@Test
	public void CDP4() {
		
		Persona per= new Persona(16, true, true);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Comfort");
	   
	}
	@Test
	public void CDP5() {
		
		Persona per= new Persona(28, true, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Independizate que va siendo hora");
	   
	}
	@Test
	public void CDP6() {
		
		Persona per= new Persona(24, true, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Saltando del Nido");
	   
	}
	@Test
	public void CDP7() {
		
		Persona per= new Persona(24, false, true);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Vamos que tú puedes");
	   
	}
	@Test
	public void CDP8() {
		
		Persona per= new Persona(24, true, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP9() {
		
		Persona per= new Persona(29, false, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	public void CDP10() {
		
		Persona per= new Persona(19, true, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Saltando del Nido");
	   
	}
	@Test
	public void CDP11() {
		
		Persona per= new Persona(19, true, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP12() {
		
		Persona per= new Persona(19, false, true);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Vamos que tú puedes");
	   
	}
	@Test
	public void CDP13() {
		
		Persona per= new Persona(20, false, true);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Vamos que tú puedes");
	   
	}
	@Test
	public void CDP14() {
		
		Persona per= new Persona(29, false, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Bienvenido a la Vida Adulta");
	   
	}
	@Test
	public void CDP15() {
		
		Persona per= new Persona(29, true, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Independizate que va siendo hora");
	   
	}
	@Test
	public void CDP16() {
		
		Persona per= new Persona(29, false, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP17() {
		
		Persona per= new Persona(19, true, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP18() {
		
		Persona per= new Persona(29, false, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Bienvenido a la Vida Adulta");
	   
	}
	@Test
	public void CDP19() {
		
		Persona per= new Persona(29, true, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Saltando del Nido");
	   
	}
	@Test
	public void CDP20() {
		
		Persona per= new Persona(29, true, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP21() {
		
		Persona per= new Persona(20, false, false);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP22() {
		
		Persona per= new Persona(26, false, false);
		assertEquals(Main.encontrarCuenta(persona), "Cuenta Bienvenido a la Vida Adulta");
	   
	}
	public void CDP23() {
		
		Persona per= new Persona(26, false, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
	@Test
	public void CDP24() {
		
		Persona per= new Persona(26, true, true);
		assertEquals(Main.encontrarCuenta(persona), "No tenemos cuenta para ti, ¿estás seguro que has metido bien tus datos?");
	   
	}
}
