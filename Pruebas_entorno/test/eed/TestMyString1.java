package eed;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestMyString1  {
	
	@Test
	public void contarPalabrasTest() {
		assertEquals(MyString1.contarPalabras("Buenas tardes"), 2);
		assertEquals(MyString1.contarPalabras("    Buenas    "), 1);
		assertEquals(MyString1.contarPalabras(""), 0);
		assertEquals(MyString1.contarPalabras(null), 0);

	}
	
	@Test
	public void contarLetrasDiferentesTest() {
		assertEquals(MyString1.contarLetrasDiferentes("Hola"), 4);
		assertEquals(MyString1.contarLetrasDiferentes("a"), 1);
		assertEquals(MyString1.contarLetrasDiferentes(""), 0);
		assertEquals(MyString1.contarLetrasDiferentes(null), 0);
	}
	
	@Test
	public void contarFrecuenciaPalabrasTest() {
		assertEquals(MyString1.contarFrecuenciaPalabras("hola holahola"), Map.of("hola", 1, "holahola", 1));
		assertEquals(MyString1.contarFrecuenciaPalabras("hola hola"), Map.of("hola", 2));
		assertEquals(MyString1.contarFrecuenciaPalabras(""), Map.of());
		assertEquals(MyString1.contarFrecuenciaPalabras(null), Map.of());
	}
	
	@Test
	public void contarFrecuenciaLetrasTest() {
		assertEquals(MyString1.contarFrecuenciaLetras("holaaa"), Map.of('a', 3, 'h', 1, 'l', 1, 'o', 1));
		assertEquals(MyString1.contarFrecuenciaLetras("hola holaa"), Map.of('a', 3, 'h', 2, 'l', 2, 'o', 2));
		assertEquals(MyString1.contarFrecuenciaLetras(""), Map.of());
		assertEquals(MyString1.contarFrecuenciaLetras(null), Map.of());
	}
	
	@Test
	public void esPalindromaTest() {
		assertTrue(MyString1.esPalindroma("asa"));
		assertFalse(MyString1.esPalindroma("asas"));
		assertFalse(MyString1.esPalindroma(""));
		assertFalse(MyString1.esPalindroma(null));
	}
	
	@Test
	public void instanciaTest() {
		MyString1 string = new MyString1("hola");
		assertTrue(true);
	
	}

}
