package main;

import herencias_pokemon.*;

public class Start {

	public static void main(String[] args) {
		
		Pikachu pika = new Pikachu("Pikachu",2,100);
		System.out.println(pika.rayo());
		Charmander charmander = new Charmander("Charmander",4,90);
		System.out.println(charmander.llamarada());
		Squirtle squirtle = new Squirtle("Squirtle",3,89);
		System.out.println(squirtle.potenciaChorro());
		
		Pokemon pokemons[];
		
		pokemons = new Pokemon[3] ;
		pokemons[0] = pika;
		pokemons[1] = charmander;
		pokemons[2] = squirtle;
		
		for(int i=0;i<pokemons.length;i++) {
			
			
			System.out.println("Atributos-->"+pokemons[i]);
			System.out.println("Evoluciones Pokemons-->"+pokemons[i].evolucion());
			System.out.println(">>>>>>>>>>>>>>>>>>>");
		}
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><");
		
		//foreach
		for (Pokemon p : pokemons) {
			System.out.println("Atributos-->"+p);
			System.out.println("Evoluciones Pokemons-->"+p.evolucion());
			//subida de edad por el doble
			p.setEdad(p.getEdad()*2);
			System.out.println("Edad--> "+p.getEdad());
			
			System.out.println(">>>>>>>>>>>>>>>>>>>");
		}
		
		
		
	}

}
