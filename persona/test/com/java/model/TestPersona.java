package com.java.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestPersona {
	private static Persona persona1;
	private static Persona persona2;
	private static Persona persona3;
	
	@BeforeAll
	static void crearObjeto() {
		persona1 = new Persona();
		persona2 = new Persona("Pepe", 19, 'M');
		persona3 = new Persona("Pepe", 19, 'H', 80, 1.8);
	}

	@Test
	public void testPersona() {
		assertEquals(persona1.getAltura(), 0);
		assertEquals(persona1.getEdad(), 0);
		assertEquals(persona1.getNombre(), "");
		assertEquals(persona1.getPeso(), 0);
//		assertTrue(persona1.getSexo()=='H');
		assertEquals(persona1.getSexo(), 'H');
	}

	@Test
	void testPersonaStringIntChar() {
		assertEquals(persona2.getAltura(), 0);
		assertEquals(persona2.getEdad(), 19);
		assertEquals(persona2.getNombre(), "Pepe");
		assertEquals(persona2.getPeso(), 0);
//		assertTrue(persona2.getSexo()=='H');
		assertEquals(persona2.getSexo(), 'M');	
	}

	@Test
	void testPersonaStringIntCharDoubleDouble() {
		assertEquals(persona3.getNombre(), "Pepe");
		assertEquals(persona3.getEdad(), 19);
		assertEquals(persona3.getPeso(), 80);
		assertEquals(persona3.getSexo(), 'H');	
		assertEquals(persona3.getAltura(), 1.8);
//		assertTrue(persona3.getSexo()=='H');
	}

	@Test
	void testSetNombre() {
		Persona Persona3Clon = Persona.clonarObjeto(persona3);
		Persona3Clon.setNombre("Pepillo");
		assertEquals(Persona3Clon.getNombre(), "Pepillo");
	}

	@Test
	void testSetEdad() {
		Persona Persona3Clon = Persona.clonarObjeto(persona3);
		Persona3Clon.setEdad(20);
		assertEquals(Persona3Clon.getEdad(), 20);	
	}

	@Test
	void testSetSexo() {
		Persona Persona3Clon = Persona.clonarObjeto(persona3);
		Persona3Clon.setSexo('M');
		assertEquals(Persona3Clon.getSexo(), 'M');	
	}

	@Test
	void testSetPeso() {
		Persona Persona3Clon = Persona.clonarObjeto(persona3);
		Persona3Clon.setPeso(90);
		assertEquals(Persona3Clon.getPeso(), 90);
	}
	
	@Test
	void testSetDNI() {
		Persona Persona3Clon = Persona.clonarObjeto(persona3);
		Persona3Clon.setDNI("12345678A");
		assertEquals(Persona3Clon.getDNI(), "12345678A");
	}

	@Test
	void testSetAltura() {
		Persona Persona3Clon = Persona.clonarObjeto(persona3);
		Persona3Clon.setAltura(1.90);
		assertEquals(Persona3Clon.getAltura(), 1.90);
	}

	@Test
	void testCalcularIMC() {
		Persona pesoActualMayor25 = new Persona("P", 20, 'H', 85, 1.8);
		Persona pesoActualEntre20_25 = new Persona("P", 20, 'H', 80, 1.8);
		Persona pesoActualMenor20 = new Persona("P", 20, 'H', 50, 1.8);


		assertEquals(pesoActualMayor25.calcularIMC(), 1);
		assertEquals(pesoActualEntre20_25.calcularIMC(), 0);
		assertEquals(pesoActualMenor20.calcularIMC(), -1);
	}

	@Test
	void testEsMayorDeEdad() {
		assertFalse(persona1.esMayorDeEdad());
		assertTrue(persona2.esMayorDeEdad());
		assertTrue(persona3.esMayorDeEdad());
	}

	@Test
	void testToString() {
		assertTrue(persona1.toString().contains("hombre"));
		assertTrue(persona2.toString().contains("mujer"));
		assertTrue(persona1.toString().contains(persona1.getNombre()));
		assertTrue(persona1.toString().contains(String.valueOf(persona1.getEdad())));
		assertTrue(persona1.toString().contains(String.valueOf(persona1.getPeso())));
		assertTrue(persona1.toString().contains(String.valueOf(persona1.getAltura())));
		assertTrue(persona1.toString().contains(String.valueOf(persona1.getDNI())));
	}
	
	@Test
	void comprobarSexo() {
		Persona personaSexoH = new Persona("Pepe", 20, 'R');
		assertEquals('H', personaSexoH.getSexo());
	}

}
