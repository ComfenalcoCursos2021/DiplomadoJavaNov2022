/**
 * 
 */
package com.alv.test;

import com.alv.dto.Comprador;

import junit.framework.TestCase;

/**
 * @author DELL
 *
 */
public class CompradorTest extends TestCase {

	/**
	 * Test method for {@link com.alv.dto.Usuario#acumularPuntos(int)}.
	 */
	public void testAcumularPuntos() {
		Comprador  comp = new Comprador();
		comp.acumularPuntos(50000);
		assertEquals(comp.getPuntos(), 50000/100);
	}
	public void testNombre() {
		Comprador  comp = new Comprador();
		comp.setNombre("EL NOMBRE");
		
		assertTrue(comp.getNombre().equals("EL NOMBRE"));
	}

}
