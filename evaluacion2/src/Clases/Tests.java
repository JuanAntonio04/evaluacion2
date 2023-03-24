package Clases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Tests {

	TablaEnteros tabla, tabla2;
	
	@BeforeEach
	void Constructor() {
		
		Integer numeros[] = {2,3,4};

		tabla = new TablaEnteros(numeros);
		tabla2 = null;
		Assertions.assertThrows(IllegalArgumentException.class,() -> tabla2 = new TablaEnteros(null));
		
	}
	
	@Test
	void testSuma() {
		int resultadoEsperado=9;
		assertEquals(resultadoEsperado, tabla.sumaTabla());
	}

	@Test
	void testMayor() {
		int resultadoEsperado=4;
		assertEquals(resultadoEsperado, tabla.mayorTabla());
	}
	
	@ParameterizedTest
	@CsvSource ({"2,0","5,2"})
	void testPosiciones(int numero, int posicionEsperada) {
		
		assertEquals(posicionEsperada, tabla.posicionTabla(numero));
		Assertions.assertThrows(NoSuchElementException.class,() -> tabla.posicionTabla(6));
		
	}
	
}
