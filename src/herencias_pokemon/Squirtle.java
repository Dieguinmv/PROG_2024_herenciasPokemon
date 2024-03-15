package herencias_pokemon;

import agua.agua;

public class Squirtle extends Pokemon implements agua{
	
	private int grosorCaparazon;
	
	public Squirtle(String nombre,int edad,int grosorCaparazon) {
		
		super(nombre,edad);
		this.grosorCaparazon = grosorCaparazon;
	}
	
	public String evolucion() {
		return "Wartortle";
	}

	public int getGrosorCaparazon() {
		return grosorCaparazon;
	}

	public void setGrosorCaparazon(int grosorCaparazon) {
		this.grosorCaparazon = grosorCaparazon;
	}

	@Override
	public String toString() {
		return "Squirtle [" +getNombre() +"|"+ getEdad()+"|"+grosorCaparazon+"]";
	}

	@Override
	public int potenciaChorro() {
		return (int)(Math.random()*256);
	}
	
	
}
