package com.krakedev.alien.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class AlienTest {
	@Test
	public void testAtributosYPreciosBase() {
     
        Alien a1 = new Alien(20, "Verde");

        assertEquals("Verde", a1.getColor()); 
        assertEquals(20, a1.getTamanio());
        assertEquals(4.0, a1.getPrecioCuerpo(), 0.01); 
        assertEquals(2.0, a1.getPrecioExtremidad(), 0.01); 
        assertEquals(1.0, a1.getPrecioOjo(), 0.01); 
    }
	@Test
    public void testRestriccionTamañoMinimo() {
       
        Alien a1 = new Alien(3, "Gris");
        assertEquals(5, a1.getTamanio()); 
        
        assertEquals(1.0, a1.getPrecioCuerpo(), 0.01); 
    }
	@Test
    public void testRestriccionTamañoMaximo() {
        
        Alien a1 = new Alien(50, "Negro");
        assertEquals(30, a1.getTamanio()); 
        
        assertEquals(6.0, a1.getPrecioCuerpo(), 0.01); 
    }
	

}
