package eed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestMyString1  {
	
	@Test
	public void contarPalabrasTest() {
		assertEquals(MyString1.contarPalabras("Buenas tardes"), 2);
		assertEquals(MyString1.contarPalabras("    Buenas    "), 1);
		assertEquals(MyString1.contarPalabras(""), 0);
	}
	
	@Test
	public void contarLetrasDiferentesTest() {
		assertEquals(MyString1.contarLetrasDiferentes("Hola"), 4);
		assertEquals(MyString1.contarLetrasDiferentes("a"), 1);
		assertEquals(MyString1.contarLetrasDiferentes(""), 0);
	}
	
	@Test
	public void contarFrecuenciaPalabrasTest() {
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		frecuenciaPalabras.put("hola", 2);
		assertEquals(MyString1.contarFrecuenciaPalabras("hola hola"), frecuenciaPalabras);
		Map<String, Integer> frecuenciaPalabras2 = new HashMap<>();
		frecuenciaPalabras2.put("hola", 2);
		assertEquals(MyString1.contarFrecuenciaPalabras("hola hola"), frecuenciaPalabras2);
	}
	
	@Test
	public void contarFrecuenciaLetrasTest() {
		Map<Character, Integer> frecuenciaLetras = new HashMap<>();
		frecuenciaLetras.put('a', 2);
		assertEquals(MyString1.contarFrecuenciaLetras("hola hola"), frecuenciaLetras);
		Map<Character, Integer> frecuenciaLetras2 = new HashMap<>();
		frecuenciaLetras2.put(' ', 1);
		assertEquals(MyString1.contarFrecuenciaLetras("hola hola"), frecuenciaLetras2);
	}

}
