package ar.utn.dds;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPersona {

	private Persona persona;
	
	@Before
	public void initPersona(){
		this.persona = new Persona();
	}
	
	@Test
	public void noEstaEnComaOK(){
		this.persona.setTemperatura(40);
		assertFalse(this.persona.estaEnComa());
		
	}
	@Test
	public void estaEnComaOK(){
		this.persona.setTemperatura(46);
		assertTrue(this.persona.estaEnComa());
		
	}
}
