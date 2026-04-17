package com.krakedev.alien;

public class Alien {
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	private double precioTotal;
	
	
	public Alien(int tamanio, String color) {
	
		if (tamanio < 5) {
            this.tamanio = 5;
        } else if (tamanio > 30) {
            this.tamanio = 30;
        } else {
            this.tamanio = tamanio;
	}
		this.color = color;
		
		this.numeroOjos = 0;
        this.numeroBrazos = 0;
        this.numeroPies = 0;
        this.precioTotal = 0.0;
        
        this.precioCuerpo = this.tamanio * 0.20;
        this.precioExtremidad = this.tamanio * 0.10;
        this.precioOjo = this.tamanio * 0.05;
        
        actualizarPrecioTotal();
	
	}
	private void actualizarPrecioTotal() {
        this.precioTotal = this.precioCuerpo + 
                          (this.numeroOjos * this.precioOjo) + 
                          ((this.numeroBrazos + this.numeroPies) * this.precioExtremidad);
    }
	public void imprimir() {
        System.out.println("--- DETALLES DEL ALIEN ---");
        System.out.println("Tamaño: " + tamanio + " cm");
        System.out.println("Color: " + color);
        System.out.println("Brazos: " + numeroBrazos + " | Piernas: " + numeroPies);
        System.out.println("Ojos: " + numeroOjos);
        System.out.println("Precio Cuerpo: $" + precioCuerpo);
        System.out.println("Precio Total: $" + precioTotal);
    }
	public void agregarBrazos(int numeroBrazos) {
	    this.numeroBrazos += numeroBrazos;
	    actualizarPrecioTotal();
	}
	public void agregarOjos(int numeroOjos) {
        this.numeroOjos += numeroOjos;
        actualizarPrecioTotal();
    }
    
    public void agregarPies(int numeroPies) {
        this.numeroPies += numeroPies;
        actualizarPrecioTotal();
    }
	


	public int getTamanio() {
		return tamanio;
	}
	public String getColor() {
		return color;
	}
	public int getNumeroOjos() {
		return numeroOjos;
	}
	public int getNumeroBrazos() {
		return numeroBrazos;
	}
	public int getNumeroPies() {
		return numeroPies;
	}
	public double getPrecioExtremidad() {
		return precioExtremidad;
	}
	public double getPrecioOjo() {
		return precioOjo;
	}
	public double getPrecioCuerpo() {
		return precioCuerpo;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}


	
	

}
