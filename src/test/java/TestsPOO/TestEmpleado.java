package TestsPOO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ejerciciosPOO.Persona;
import ejerciciosPOO.Empleado;

public class TestEmpleado {
	@Test
	void testEmpleado() {
		Persona p1= new Persona("Pedro", "Sánchez", "77938276Q", 2004,"Presidente");
		Persona p2= new Persona("Mar", "Mártin","12345678A", 2004, "Océano");
		Persona p3= new Persona("Pepito","Pepote","12345678A",2000,"El pepe");
		
		Empleado e1 = new Empleado(1,"Administración", p1);
		Empleado e2 = new Empleado(2, "Finanzas", p2);
		Empleado e3 = new Empleado(3,"Contabilidad",p3);
		Empleado e4 = null;
	
	
	try {
		e4 = (Empleado) e1.clone();
	}catch (CloneNotSupportedException e) {
		e.printStackTrace();
		}	
	
	Empleado e5 = e1;
	Empleado e6 = new Empleado (1,"Administración",p1);
	
	System.out.println(e1.toString());

			
			assertFalse(e1 == e2);
			assertFalse(e1 == e3);
			assertFalse(e1 == e4);
			assertTrue(e1 == e5);
			assertFalse(e1 == e6);
			assertTrue(e1.equals(e5));
			assertFalse(e1.equals(e2));
			assertTrue(e1.equals(e6));
	}
}
