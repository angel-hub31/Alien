package com.krakedev.alien.test;

import com.krakedev.alien.Alien;

public class TestConstructore {

	public static void main(String[] args) {
		Alien alien1 = new Alien(50, "Verde");
        alien1.agregarBrazos(2);
        alien1.agregarOjos(1);
        alien1.imprimir(); 

        Alien alien2 = new Alien(2, "Azul");
        alien2.imprimir(); 
	}

}
