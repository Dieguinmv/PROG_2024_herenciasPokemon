package herencias_pokemon;

import electrico.electrico;

public class Pikachu extends Pokemon implements electrico {
	
	private int velocidad;

	public Pikachu(String nombre, int edad, int velocidad) {
		super(nombre, edad);
		this.velocidad = velocidad;
	}

	@Override
	public String evolucion() {
		return "Raichu";
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Pikachu [" +getNombre() + "|" + getEdad()+"|"+ velocidad+"]";
	}

	@Override
	public int rayo() {
		return (int)(Math.random()*256);
	}
	
	
	
	
}
