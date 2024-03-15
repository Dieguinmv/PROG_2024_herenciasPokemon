package herencias_pokemon;

public abstract class  Pokemon {
	
	private String nombre;
	private int edad;
	
	public Pokemon(String nombre,int edad) {
		
		this.nombre = nombre;
		setEdad(edad);
	}
	
	//a implementar en las clases derivadas 
	public abstract String evolucion();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad<=0) {
			this.edad =1;
		}
		
		else this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pokemon ["+nombre +"|"+ edad + "]";
	}
	
	
	
	
	
}
