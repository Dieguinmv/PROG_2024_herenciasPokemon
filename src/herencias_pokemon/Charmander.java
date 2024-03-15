package herencias_pokemon;

import fuego.fuego;

public class Charmander extends Pokemon implements fuego {
	
	private int alturaLLama;
	
	public Charmander(String nombre,int edad,int alturaLlama) {
		
		super(nombre,edad);
		setAlturaLLama(alturaLLama);	
	}
	
	public String evolucion() {
		
		return "Charmeleon";
	}

	public int getAlturaLLama() {
		return alturaLLama;
	}

	public void setAlturaLLama(int alturaLLama) {
		
		if(alturaLLama<10) {
			this.alturaLLama =10;	
		}
		else this.alturaLLama = alturaLLama;
	}

	@Override
	public String toString() {
		return "Charmander ["+ getNombre()+"|"+getEdad()+"|"+alturaLLama+ "]";
	}

	@Override
	public int llamarada() {
		return (int)(Math.random()*256);
	}
	
	
	
}
