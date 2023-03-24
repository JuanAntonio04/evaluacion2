package Clases;

/**
 * Clase Tabla Enteros.
 * 
 * Comentario en nueva rama.
 * 
 * @author Juan Antonio Bozada Nieto
 * 
 * @since 24/03/2023
 * 
 * @version 1.0
 * 
 * @see <a href="https://educacionadistancia.juntadeandalucia.es/centros/sevilla/">Moodle</a>
 *
 */
public class TablaEnteros {
	
	/**
	 * Atributo de la clase.
	 */
	private Integer[] tabla;

	/**
	 * Constructor de la clase.
	 * 
	 * @param tabla : Arrays de numeros enteros.
	 */
	TablaEnteros(Integer[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	/**
	 * Metodo que devuelve la suma de la Tabla.
	 * 
	 * @return : Suma de la tabla.
	 */
	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
			suma += tabla[i];
		return suma;
	}

	/**
	 * Metodo que devuelve el mayor elemento de la tabla.
	 * 
	 * @return : Mayor numero de la tabla.
	 */
	public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] > max)
				max = tabla[i];
		return max;
	}

	/**
	 * Metodo que devuelve la posicion de un elemento cuyo valor se pasa.
	 * 
	 * @param n : Numero entero.
	 * 
	 * @return El numero que se pasa.
	 */
	public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] == n)
				return i;
		throw new java.util.NoSuchElementException("No existe: " + n);
	}
}
