package TestsPOO;

import org.junit.jupiter.api.Test;

import ejerciciosPOO.Persona;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestPersona {
	
	@Test
	void testPersonas() {
		Persona p1= new Persona("Pedro", "Sánchez", "77938276Q", 2004,"Presidente");
		Persona p2= new Persona("Mar", "Mártin","12345678A", 2004, "Océano");
		Persona p3= new Persona("Pepito","Pepote","12345678A",2000,"El pepe");
		
		Persona p4= new Persona(p1);
		Persona p5= p1;
		Persona p6= null;
		
		try {
			p6 = (Persona) p1.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
		assertFalse(p1 == p2);
		assertFalse(p1 == p3);
		assertFalse(p1 == p4);
		assertTrue(p1 == p5);
		assertFalse(p1 == p6);
	}

}
